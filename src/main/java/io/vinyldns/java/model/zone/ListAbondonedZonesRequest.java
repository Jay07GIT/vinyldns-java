/*
 * Copyright 2018 Comcast Cable Communications Management, LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Copyright 2018 Comcast Cable Communications Management, LLC
 *
 * <p>Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file
 * except in compliance with the License. You may obtain a copy of the License at
 *
 * <p>http://www.apache.org/licenses/LICENSE-2.0
 *
 * <p>Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */
package io.vinyldns.java.model.zone;

public class ListAbandonedZonesRequest {

  /**
   * One or more characters contained in the name of the abandoned dzone to search for. For example www-. This
   * is a contains search only, no wildcards or regular expressions are supported
   */
  private String nameFilter;

  /**
   * In order to advance through pages of results, the startFrom is set to the nextId that is
   * returned on the previous response. It is up to the client to maintain previous pages if the
   * client wishes to advance forward and backward. If not specified, will return the first page of
   * results
   */
  private String startFrom;

  /**
   * The number of items to return in the page. Valid values are 1 to 100. Defaults to 100 if not
   * provided.
   */
  private Integer maxItems;

  private Boolean ignoreAccess;

  public ListAbandonedZonesRequest() {}

  public ListAbandonedZonesRequest(String nameFilter) {
    this.nameFilter = nameFilter;
  }

  public ListAbandonedZonesRequest(
      String nameFilter, String startFrom, Integer maxItems, Boolean ignoreAccess) {
    this.nameFilter = nameFilter;
    this.startFrom = startFrom;
    this.maxItems = maxItems;
    this.ignoreAccess = ignoreAccess;
  }

  public String getNameFilter() {
    return nameFilter;
  }

  public void setNameFilter(String nameFilter) {
    this.nameFilter = nameFilter;
  }

  public String getStartFrom() {
    return startFrom;
  }

  public void setStartFrom(String startFrom) {
    this.startFrom = startFrom;
  }

  public Integer getMaxItems() {
    return maxItems;
  }

  public void setMaxItems(Integer maxItems) {
    this.maxItems = maxItems;
  }

  public Boolean getIgnoreAccess() {
    return ignoreAccess;
  }

  public void setIgnoreAccess(Boolean ignoreAccess) {
    this.ignoreAccess = ignoreAccess;
  }

  @Override
  public String toString() {
    return "ListAbandonedZonesRequest{"
        + "nameFilter='"
        + nameFilter
        + '\''
        + ", startFrom='"
        + startFrom
        + '\''
        + ", maxItems="
        + maxItems
        + ", ignoreAccess="
        + ignoreAccess
        + '}';
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;

    ListAbandonedZonesRequest that = (ListAbandonedZonesRequest) o;

    if (nameFilter != null ? !nameFilter.equals(that.nameFilter) : that.nameFilter != null)
      return false;
    if (startFrom != null ? !startFrom.equals(that.startFrom) : that.startFrom != null)
      return false;
    return maxItems != null ? maxItems.equals(that.maxItems) : that.maxItems == null;
  }

  @Override
  public int hashCode() {
    int result = nameFilter != null ? nameFilter.hashCode() : 0;
    result = 31 * result + (startFrom != null ? startFrom.hashCode() : 0);
    result = 31 * result + (maxItems != null ? maxItems.hashCode() : 0);
    result = 31 * result + (ignoreAccess != null ? ignoreAccess.hashCode() : 0);
    return result;
  }
}