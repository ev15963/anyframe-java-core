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
package org.anyframe.plugin.mobile.moviefinder.service;

import org.anyframe.pagination.Page;
import org.anyframe.plugin.mobile.domain.Movie;

/**
 * This MovieFinder class is an Interface class to provide movie list
 * functionality.
 * 
 * @author Jongpil Park
 */
public interface MovieFinder {
	
	Movie get(String movieId) throws Exception;

	Page getPagingList(Movie movie, int pageIndex) throws Exception;
	
	Page getPagingListWithDate(String startDate, String endDate, int pageIndex) throws Exception;

}