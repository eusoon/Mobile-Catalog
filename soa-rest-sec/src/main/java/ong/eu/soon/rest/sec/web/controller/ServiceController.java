package ong.eu.soon.rest.sec.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import ong.eu.soon.rest.common.util.QueryConstants;
import ong.eu.soon.rest.common.web.controller.AbstractController;
import ong.eu.soon.rest.common.web.controller.ISortingController;
import ong.eu.soon.rest.sec.model.Service;
import ong.eu.soon.rest.sec.persistence.service.IServiceService;
import ong.eu.soon.rest.sec.util.SecurityConstants.Privileges;
import ong.eu.soon.rest.sec.web.common.UriMappingConstants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.util.UriComponentsBuilder;

@Controller
@RequestMapping(value = UriMappingConstants.SERVICES)
public class ServiceController extends AbstractController<Service> implements
ISortingController<Service> {

	@Autowired
	private IServiceService service;

	public ServiceController() {
		super(Service.class);
	}

	// API

	// search

	@RequestMapping(params = { QueryConstants.Q_PARAM }, method = RequestMethod.GET)
	@ResponseBody
	@Secured(Privileges.CAN_PRIVILEGE_READ)
	public List<Service> search(
			@RequestParam(QueryConstants.Q_PARAM) final String queryString) {
		return searchInternal(queryString);
	}

	@RequestMapping(params = { QueryConstants.Q_PARAM, QueryConstants.PAGE,
			QueryConstants.SIZE }, method = RequestMethod.GET)
	@ResponseBody
	@Secured(Privileges.CAN_PRIVILEGE_READ)
	public List<Service> searchPaginated(
			@RequestParam(QueryConstants.Q_PARAM) final String queryString,
			@RequestParam(value = QueryConstants.PAGE) final int page,
			@RequestParam(value = QueryConstants.SIZE) final int size) {
		return searchInternalPaginated(queryString, page, size);
	}

	// find - all/paginated

	@Override
	@RequestMapping(params = { QueryConstants.PAGE, QueryConstants.SIZE,
			QueryConstants.SORT_BY }, method = RequestMethod.GET)
	@ResponseBody
	@Secured(Privileges.CAN_PRIVILEGE_READ)
	public List<Service> findAllPaginatedAndSorted(
			@RequestParam(value = QueryConstants.PAGE) final int page,
			@RequestParam(value = QueryConstants.SIZE) final int size,
			@RequestParam(value = QueryConstants.SORT_BY) final String sortBy,
			@RequestParam(value = QueryConstants.SORT_ORDER) final String sortOrder,
			final UriComponentsBuilder uriBuilder,
			final HttpServletResponse response) {
		return findPaginatedAndSortedInternal(page, size, sortBy, sortOrder,
				uriBuilder, response);
	}

	@Override
	@RequestMapping(params = { QueryConstants.PAGE, QueryConstants.SIZE }, method = RequestMethod.GET)
	@ResponseBody
	@Secured(Privileges.CAN_PRIVILEGE_READ)
	public List<Service> findAllPaginated(
			@RequestParam(value = QueryConstants.PAGE) final int page,
			@RequestParam(value = QueryConstants.SIZE) final int size,
			final UriComponentsBuilder uriBuilder,
			final HttpServletResponse response) {
		return findPaginatedAndSortedInternal(page, size, null, null,
				uriBuilder, response);
	}

	@Override
	@RequestMapping(params = { QueryConstants.SORT_BY }, method = RequestMethod.GET)
	@ResponseBody
	@Secured(Privileges.CAN_PRIVILEGE_READ)
	public List<Service> findAllSorted(
			@RequestParam(value = QueryConstants.SORT_BY) final String sortBy,
			@RequestParam(value = QueryConstants.SORT_ORDER) final String sortOrder) {
		return findAllSortedInternal(sortBy, sortOrder);
	}

	@Override
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	@Secured(Privileges.CAN_PRIVILEGE_READ)
	public List<Service> findAll(final HttpServletRequest request,
			final UriComponentsBuilder uriBuilder,
			final HttpServletResponse response) {
		return findAllInternal(request, uriBuilder, response);
	}

	// find - one

	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	@ResponseBody
	@Secured(Privileges.CAN_PRIVILEGE_READ)
	public Service findOne(@PathVariable("id") final Long id,
			final UriComponentsBuilder uriBuilder,
			final HttpServletResponse response) {
		return findOneInternal(id, uriBuilder, response);
	}

	// create

	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	@Secured(Privileges.CAN_PRIVILEGE_WRITE)
	public void create(@RequestBody final Service resource,
			final UriComponentsBuilder uriBuilder,
			final HttpServletResponse response) {
		createInternal(resource, uriBuilder, response);
	}

	// update

	@RequestMapping(value = "/{id}", method = RequestMethod.PUT)
	@ResponseStatus(HttpStatus.OK)
	@Secured(Privileges.CAN_PRIVILEGE_WRITE)
	public void update(@PathVariable("id") final Long id,
			@RequestBody final Service resource) {
		updateInternal(id, resource);
	}

	// delete

	@RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
	@ResponseStatus(HttpStatus.NO_CONTENT)
	@Secured(Privileges.CAN_PRIVILEGE_WRITE)
	public void delete(@PathVariable("id") final Long id) {
		deleteByIdInternal(id);
	}

	// Spring

	@Override
	protected final IServiceService getService() {
		return service;
	}

}
