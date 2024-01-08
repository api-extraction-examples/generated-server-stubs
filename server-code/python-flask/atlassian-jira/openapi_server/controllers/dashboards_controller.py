import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.available_dashboard_gadgets_response import AvailableDashboardGadgetsResponse  # noqa: E501
from openapi_server.models.dashboard import Dashboard  # noqa: E501
from openapi_server.models.dashboard_details import DashboardDetails  # noqa: E501
from openapi_server.models.dashboard_gadget import DashboardGadget  # noqa: E501
from openapi_server.models.dashboard_gadget_response import DashboardGadgetResponse  # noqa: E501
from openapi_server.models.dashboard_gadget_settings import DashboardGadgetSettings  # noqa: E501
from openapi_server.models.dashboard_gadget_update_request import DashboardGadgetUpdateRequest  # noqa: E501
from openapi_server.models.entity_property import EntityProperty  # noqa: E501
from openapi_server.models.error_collection import ErrorCollection  # noqa: E501
from openapi_server.models.page_bean_dashboard import PageBeanDashboard  # noqa: E501
from openapi_server.models.page_of_dashboards import PageOfDashboards  # noqa: E501
from openapi_server.models.property_keys import PropertyKeys  # noqa: E501
from openapi_server import util


def add_gadget(dashboard_id, dashboard_gadget_settings):  # noqa: E501
    """Add gadget to dashboard

    Adds a gadget to a dashboard.  **[Permissions](#permissions) required:** None. # noqa: E501

    :param dashboard_id: The ID of the dashboard.
    :type dashboard_id: int
    :param dashboard_gadget_settings: 
    :type dashboard_gadget_settings: dict | bytes

    :rtype: Union[DashboardGadget, Tuple[DashboardGadget, int], Tuple[DashboardGadget, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        dashboard_gadget_settings = DashboardGadgetSettings.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def copy_dashboard(id, dashboard_details):  # noqa: E501
    """Copy dashboard

    Copies a dashboard. Any values provided in the &#x60;dashboard&#x60; parameter replace those in the copied dashboard.  **[Permissions](#permissions) required:** None  The dashboard to be copied must be owned by or shared with the user. # noqa: E501

    :param id: 
    :type id: str
    :param dashboard_details: Dashboard details.
    :type dashboard_details: dict | bytes

    :rtype: Union[Dashboard, Tuple[Dashboard, int], Tuple[Dashboard, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        dashboard_details = DashboardDetails.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def create_dashboard(dashboard_details):  # noqa: E501
    """Create dashboard

    Creates a dashboard.  **[Permissions](#permissions) required:** None. # noqa: E501

    :param dashboard_details: Dashboard details.
    :type dashboard_details: dict | bytes

    :rtype: Union[Dashboard, Tuple[Dashboard, int], Tuple[Dashboard, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        dashboard_details = DashboardDetails.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def delete_dashboard(id):  # noqa: E501
    """Delete dashboard

    Deletes a dashboard.  **[Permissions](#permissions) required:** None  The dashboard to be deleted must be owned by the user. # noqa: E501

    :param id: The ID of the dashboard.
    :type id: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def delete_dashboard_item_property(dashboard_id, item_id, property_key):  # noqa: E501
    """Delete dashboard item property

    Deletes a dashboard item property.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** The user must be the owner of the dashboard. Note, users with the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) are considered owners of the System dashboard. # noqa: E501

    :param dashboard_id: The ID of the dashboard.
    :type dashboard_id: str
    :param item_id: The ID of the dashboard item.
    :type item_id: str
    :param property_key: The key of the dashboard item property.
    :type property_key: str

    :rtype: Union[None, Tuple[None, int], Tuple[None, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_all_available_dashboard_gadgets():  # noqa: E501
    """Get available gadgets

    Gets a list of all available gadgets that can be added to all dashboards.  **[Permissions](#permissions) required:** None. # noqa: E501


    :rtype: Union[AvailableDashboardGadgetsResponse, Tuple[AvailableDashboardGadgetsResponse, int], Tuple[AvailableDashboardGadgetsResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_all_dashboards(filter=None, start_at=None, max_results=None):  # noqa: E501
    """Get all dashboards

    Returns a list of dashboards owned by or shared with the user. The list may be filtered to include only favorite or owned dashboards.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None. # noqa: E501

    :param filter: The filter applied to the list of dashboards. Valid values are:   *  &#x60;favourite&#x60; Returns dashboards the user has marked as favorite.  *  &#x60;my&#x60; Returns dashboards owned by the user.
    :type filter: str
    :param start_at: The index of the first item to return in a page of results (page offset).
    :type start_at: int
    :param max_results: The maximum number of items to return per page.
    :type max_results: int

    :rtype: Union[PageOfDashboards, Tuple[PageOfDashboards, int], Tuple[PageOfDashboards, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_all_gadgets(dashboard_id, module_key=None, uri=None, gadget_id=None):  # noqa: E501
    """Get gadgets

    Returns a list of dashboard gadgets on a dashboard.  This operation returns:   *  Gadgets from a list of IDs, when &#x60;id&#x60; is set.  *  Gadgets with a module key, when &#x60;moduleKey&#x60; is set.  *  Gadgets from a list of URIs, when &#x60;uri&#x60; is set.  *  All gadgets, when no other parameters are set.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None. # noqa: E501

    :param dashboard_id: The ID of the dashboard.
    :type dashboard_id: int
    :param module_key: The list of gadgets module keys. To include multiple module keys, separate module keys with ampersand: &#x60;moduleKey&#x3D;key:one&amp;moduleKey&#x3D;key:two&#x60;.
    :type module_key: List[str]
    :param uri: The list of gadgets URIs. To include multiple URIs, separate URIs with ampersand: &#x60;uri&#x3D;/rest/example/uri/1&amp;uri&#x3D;/rest/example/uri/2&#x60;.
    :type uri: List[str]
    :param gadget_id: The list of gadgets IDs. To include multiple IDs, separate IDs with ampersand: &#x60;gadgetId&#x3D;10000&amp;gadgetId&#x3D;10001&#x60;.
    :type gadget_id: List[int]

    :rtype: Union[DashboardGadgetResponse, Tuple[DashboardGadgetResponse, int], Tuple[DashboardGadgetResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_dashboard(id):  # noqa: E501
    """Get dashboard

    Returns a dashboard.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** None.  However, to get a dashboard, the dashboard must be shared with the user or the user must own it. Note, users with the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) are considered owners of the System dashboard. The System dashboard is considered to be shared with all other users. # noqa: E501

    :param id: The ID of the dashboard.
    :type id: str

    :rtype: Union[Dashboard, Tuple[Dashboard, int], Tuple[Dashboard, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_dashboard_item_property(dashboard_id, item_id, property_key):  # noqa: E501
    """Get dashboard item property

    Returns the key and value of a dashboard item property.  A dashboard item enables an app to add user-specific information to a user dashboard. Dashboard items are exposed to users as gadgets that users can add to their dashboards. For more information on how users do this, see [Adding and customizing gadgets](https://confluence.atlassian.com/x/7AeiLQ).  When an app creates a dashboard item it registers a callback to receive the dashboard item ID. The callback fires whenever the item is rendered or, where the item is configurable, the user edits the item. The app then uses this resource to store the item&#39;s content or configuration details. For more information on working with dashboard items, see [ Building a dashboard item for a JIRA Connect add-on](https://developer.atlassian.com/server/jira/platform/guide-building-a-dashboard-item-for-a-jira-connect-add-on-33746254/) and the [Dashboard Item](https://developer.atlassian.com/cloud/jira/platform/modules/dashboard-item/) documentation.  There is no resource to set or get dashboard items.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** The user must be the owner of the dashboard or have the dashboard shared with them. Note, users with the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) are considered owners of the System dashboard. The System dashboard is considered to be shared with all other users, and is accessible to anonymous users when Jira’s anonymous access is permitted. # noqa: E501

    :param dashboard_id: The ID of the dashboard.
    :type dashboard_id: str
    :param item_id: The ID of the dashboard item.
    :type item_id: str
    :param property_key: The key of the dashboard item property.
    :type property_key: str

    :rtype: Union[EntityProperty, Tuple[EntityProperty, int], Tuple[EntityProperty, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_dashboard_item_property_keys(dashboard_id, item_id):  # noqa: E501
    """Get dashboard item property keys

    Returns the keys of all properties for a dashboard item.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** The user must be the owner of the dashboard or have the dashboard shared with them. Note, users with the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) are considered owners of the System dashboard. The System dashboard is considered to be shared with all other users, and is accessible to anonymous users when Jira’s anonymous access is permitted. # noqa: E501

    :param dashboard_id: The ID of the dashboard.
    :type dashboard_id: str
    :param item_id: The ID of the dashboard item.
    :type item_id: str

    :rtype: Union[PropertyKeys, Tuple[PropertyKeys, int], Tuple[PropertyKeys, int, Dict[str, str]]
    """
    return 'do some magic!'


def get_dashboards_paginated(dashboard_name=None, account_id=None, owner=None, groupname=None, group_id=None, project_id=None, order_by=None, start_at=None, max_results=None, status=None, expand=None):  # noqa: E501
    """Search for dashboards

    Returns a [paginated](#pagination) list of dashboards. This operation is similar to [Get dashboards](#api-rest-api-3-dashboard-get) except that the results can be refined to include dashboards that have specific attributes. For example, dashboards with a particular name. When multiple attributes are specified only filters matching all attributes are returned.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** The following dashboards that match the query parameters are returned:   *  Dashboards owned by the user. Not returned for anonymous users.  *  Dashboards shared with a group that the user is a member of. Not returned for anonymous users.  *  Dashboards shared with a private project that the user can browse. Not returned for anonymous users.  *  Dashboards shared with a public project.  *  Dashboards shared with the public. # noqa: E501

    :param dashboard_name: String used to perform a case-insensitive partial match with &#x60;name&#x60;.
    :type dashboard_name: str
    :param account_id: User account ID used to return dashboards with the matching &#x60;owner.accountId&#x60;. This parameter cannot be used with the &#x60;owner&#x60; parameter.
    :type account_id: str
    :param owner: This parameter is deprecated because of privacy changes. Use &#x60;accountId&#x60; instead. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. User name used to return dashboards with the matching &#x60;owner.name&#x60;. This parameter cannot be used with the &#x60;accountId&#x60; parameter.
    :type owner: str
    :param groupname: As a group&#39;s name can change, use of &#x60;groupId&#x60; is recommended. Group name used to return dashboards that are shared with a group that matches &#x60;sharePermissions.group.name&#x60;. This parameter cannot be used with the &#x60;groupId&#x60; parameter.
    :type groupname: str
    :param group_id: Group ID used to return dashboards that are shared with a group that matches &#x60;sharePermissions.group.groupId&#x60;. This parameter cannot be used with the &#x60;groupname&#x60; parameter.
    :type group_id: str
    :param project_id: Project ID used to returns dashboards that are shared with a project that matches &#x60;sharePermissions.project.id&#x60;.
    :type project_id: int
    :param order_by: [Order](#ordering) the results by a field:   *  &#x60;description&#x60; Sorts by dashboard description. Note that this sort works independently of whether the expand to display the description field is in use.  *  &#x60;favourite_count&#x60; Sorts by dashboard popularity.  *  &#x60;id&#x60; Sorts by dashboard ID.  *  &#x60;is_favourite&#x60; Sorts by whether the dashboard is marked as a favorite.  *  &#x60;name&#x60; Sorts by dashboard name.  *  &#x60;owner&#x60; Sorts by dashboard owner name.
    :type order_by: str
    :param start_at: The index of the first item to return in a page of results (page offset).
    :type start_at: int
    :param max_results: The maximum number of items to return per page.
    :type max_results: int
    :param status: The status to filter by. It may be active, archived or deleted.
    :type status: str
    :param expand: Use [expand](#expansion) to include additional information about dashboard in the response. This parameter accepts a comma-separated list. Expand options include:   *  &#x60;description&#x60; Returns the description of the dashboard.  *  &#x60;owner&#x60; Returns the owner of the dashboard.  *  &#x60;viewUrl&#x60; Returns the URL that is used to view the dashboard.  *  &#x60;favourite&#x60; Returns &#x60;isFavourite&#x60;, an indicator of whether the user has set the dashboard as a favorite.  *  &#x60;favouritedCount&#x60; Returns &#x60;popularity&#x60;, a count of how many users have set this dashboard as a favorite.  *  &#x60;sharePermissions&#x60; Returns details of the share permissions defined for the dashboard.  *  &#x60;editPermissions&#x60; Returns details of the edit permissions defined for the dashboard.  *  &#x60;isWritable&#x60; Returns whether the current user has permission to edit the dashboard.
    :type expand: str

    :rtype: Union[PageBeanDashboard, Tuple[PageBeanDashboard, int], Tuple[PageBeanDashboard, int, Dict[str, str]]
    """
    return 'do some magic!'


def remove_gadget(dashboard_id, gadget_id):  # noqa: E501
    """Remove gadget from dashboard

    Removes a dashboard gadget from a dashboard.  When a gadget is removed from a dashboard, other gadgets in the same column are moved up to fill the emptied position.  **[Permissions](#permissions) required:** None. # noqa: E501

    :param dashboard_id: The ID of the dashboard.
    :type dashboard_id: int
    :param gadget_id: The ID of the gadget.
    :type gadget_id: int

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    return 'do some magic!'


def set_dashboard_item_property(dashboard_id, item_id, property_key, body):  # noqa: E501
    """Set dashboard item property

    Sets the value of a dashboard item property. Use this resource in apps to store custom data against a dashboard item.  A dashboard item enables an app to add user-specific information to a user dashboard. Dashboard items are exposed to users as gadgets that users can add to their dashboards. For more information on how users do this, see [Adding and customizing gadgets](https://confluence.atlassian.com/x/7AeiLQ).  When an app creates a dashboard item it registers a callback to receive the dashboard item ID. The callback fires whenever the item is rendered or, where the item is configurable, the user edits the item. The app then uses this resource to store the item&#39;s content or configuration details. For more information on working with dashboard items, see [ Building a dashboard item for a JIRA Connect add-on](https://developer.atlassian.com/server/jira/platform/guide-building-a-dashboard-item-for-a-jira-connect-add-on-33746254/) and the [Dashboard Item](https://developer.atlassian.com/cloud/jira/platform/modules/dashboard-item/) documentation.  There is no resource to set or get dashboard items.  The value of the request body must be a [valid](http://tools.ietf.org/html/rfc4627), non-empty JSON blob. The maximum length is 32768 characters.  This operation can be accessed anonymously.  **[Permissions](#permissions) required:** The user must be the owner of the dashboard. Note, users with the *Administer Jira* [global permission](https://confluence.atlassian.com/x/x4dKLg) are considered owners of the System dashboard. # noqa: E501

    :param dashboard_id: The ID of the dashboard.
    :type dashboard_id: str
    :param item_id: The ID of the dashboard item.
    :type item_id: str
    :param property_key: The key of the dashboard item property. The maximum length is 255 characters. For dashboard items with a spec URI and no complete module key, if the provided propertyKey is equal to \&quot;config\&quot;, the request body&#39;s JSON must be an object with all keys and values as strings.
    :type property_key: str
    :param body: 
    :type body: 

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    return 'do some magic!'


def update_dashboard(id, dashboard_details):  # noqa: E501
    """Update dashboard

    Updates a dashboard, replacing all the dashboard details with those provided.  **[Permissions](#permissions) required:** None  The dashboard to be updated must be owned by the user. # noqa: E501

    :param id: The ID of the dashboard to update.
    :type id: str
    :param dashboard_details: Replacement dashboard details.
    :type dashboard_details: dict | bytes

    :rtype: Union[Dashboard, Tuple[Dashboard, int], Tuple[Dashboard, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        dashboard_details = DashboardDetails.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'


def update_gadget(dashboard_id, gadget_id, dashboard_gadget_update_request):  # noqa: E501
    """Update gadget on dashboard

    Changes the title, position, and color of the gadget on a dashboard.  **[Permissions](#permissions) required:** None. # noqa: E501

    :param dashboard_id: The ID of the dashboard.
    :type dashboard_id: int
    :param gadget_id: The ID of the gadget.
    :type gadget_id: int
    :param dashboard_gadget_update_request: 
    :type dashboard_gadget_update_request: dict | bytes

    :rtype: Union[object, Tuple[object, int], Tuple[object, int, Dict[str, str]]
    """
    if connexion.request.is_json:
        dashboard_gadget_update_request = DashboardGadgetUpdateRequest.from_dict(connexion.request.get_json())  # noqa: E501
    return 'do some magic!'
