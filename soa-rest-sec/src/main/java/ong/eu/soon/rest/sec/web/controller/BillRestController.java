package ong.eu.soon.rest.sec.web.controller;


import ong.eu.soon.ifx.bill.BillAddRq;
import ong.eu.soon.ifx.bill.BillAddRs;
import ong.eu.soon.ifx.bill.BillInqRq;
import ong.eu.soon.ifx.bill.BillInqRs;
import ong.eu.soon.ifx.bill.BillRevRq;
import ong.eu.soon.ifx.bill.BillRevRs;
import ong.eu.soon.rest.sec.web.common.UriMappingConstants;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(value = UriMappingConstants.BILLS)
public class BillRestController {
	@RequestMapping(value = "ifx/billAdd", method = RequestMethod.POST)
	@ResponseBody
	public BillAddRs billAdd(@RequestBody BillAddRq billAddRq) {
		BillAddRs billAddRs = new BillAddRs();
		return billAddRs;
	}
	@RequestMapping(value = "ifx/billInq", method = RequestMethod.POST)
	@ResponseBody
	public BillInqRs billInq(@RequestBody BillInqRq billInqRq) {
		BillInqRs billInqRs = new BillInqRs();
		return billInqRs;
	}
	@RequestMapping(value = "ifx/billRev", method = RequestMethod.POST)
	@ResponseBody
	public BillRevRs billRev(@RequestBody BillRevRq billRevRq) {
		BillRevRs billRevRs = new BillRevRs();
		return billRevRs;
	}
}
