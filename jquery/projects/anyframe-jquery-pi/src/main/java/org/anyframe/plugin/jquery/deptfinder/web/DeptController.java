/*
 * Copyright 2008-2012 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.anyframe.plugin.jquery.deptfinder.web;

import javax.inject.Inject;
import javax.inject.Named;

import org.anyframe.plugin.jquery.deptfinder.domain.Dept;
import org.anyframe.plugin.jquery.deptfinder.service.DeptService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * This DeptController class is a Controller class to provide dept crud functionality
 * 
 * @author Jonghwan Jeong
 */

@Controller("jqueryDeptController")
@RequestMapping("/jqueryDept.do")
public class DeptController {

	@Inject
	@Named("jqueryDeptService")
	private DeptService deptService;

	@RequestMapping(params = "method=get")
	public String getId(String deptId, Model model) throws Exception {
		Dept dept = deptService.get(deptId);
		model.addAttribute("dept", dept);
		return "jsonView";
	}
}
