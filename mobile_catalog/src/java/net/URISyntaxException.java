package java.net;
/*
 * Created on Mar 7, 2011
 * Portions of  this code are distributed under the MIT lincense (specifically the generateUUIDString method)
 * 
 * The MIT lincense
 * Copyright (c) 2010 Robert Kieffer
 * Permission is hereby granted, free of charges, to any person obtaining a  copy of this software
 * and associated documentation files (the "Software"), to deal in the Software without restriction,
 * including without limitation the rights to use, copy, modify merge, publish, distribute, sublincense,
 * and/or sell copies of the Software, and to permit  person to whom the Software is furnished to do so,
 * subject to the following conditions:
 * 
 * The above copyright notice and this permission notice  shall be included  in all copies  or substantial 
 * portion of the Software.
 * 
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT
 * LIMITED TO  THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRIGEMENT. IN
 * NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER  LIABILITY,
 * WHETHER IN AN  ACTION  OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH
 * THE SOFTWARE OR THE USE  OR OTHER DEALINGS IN THE SOFTWARE.
 * 
 */
public class URISyntaxException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -94540889641626170L;
	public URISyntaxException(){
		
	}
	public URISyntaxException(String s){
		super(s);
	}
	public URISyntaxException(Throwable throwable){
		super(throwable);
	}
	public URISyntaxException(String s,Throwable throwable){
		super(s, throwable);
	}
}
