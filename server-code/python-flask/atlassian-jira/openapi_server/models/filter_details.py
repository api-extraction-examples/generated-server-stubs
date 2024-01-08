from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.filter_details_owner import FilterDetailsOwner
from openapi_server.models.filter_subscription import FilterSubscription
from openapi_server.models.share_permission import SharePermission
from openapi_server import util

from openapi_server.models.filter_details_owner import FilterDetailsOwner  # noqa: E501
from openapi_server.models.filter_subscription import FilterSubscription  # noqa: E501
from openapi_server.models.share_permission import SharePermission  # noqa: E501

class FilterDetails(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, description=None, edit_permissions=None, expand=None, favourite=None, favourited_count=None, id=None, jql=None, name=None, owner=None, search_url=None, _self=None, share_permissions=None, subscriptions=None, view_url=None):  # noqa: E501
        """FilterDetails - a model defined in OpenAPI

        :param description: The description of this FilterDetails.  # noqa: E501
        :type description: str
        :param edit_permissions: The edit_permissions of this FilterDetails.  # noqa: E501
        :type edit_permissions: List[SharePermission]
        :param expand: The expand of this FilterDetails.  # noqa: E501
        :type expand: str
        :param favourite: The favourite of this FilterDetails.  # noqa: E501
        :type favourite: bool
        :param favourited_count: The favourited_count of this FilterDetails.  # noqa: E501
        :type favourited_count: int
        :param id: The id of this FilterDetails.  # noqa: E501
        :type id: str
        :param jql: The jql of this FilterDetails.  # noqa: E501
        :type jql: str
        :param name: The name of this FilterDetails.  # noqa: E501
        :type name: str
        :param owner: The owner of this FilterDetails.  # noqa: E501
        :type owner: FilterDetailsOwner
        :param search_url: The search_url of this FilterDetails.  # noqa: E501
        :type search_url: str
        :param _self: The _self of this FilterDetails.  # noqa: E501
        :type _self: str
        :param share_permissions: The share_permissions of this FilterDetails.  # noqa: E501
        :type share_permissions: List[SharePermission]
        :param subscriptions: The subscriptions of this FilterDetails.  # noqa: E501
        :type subscriptions: List[FilterSubscription]
        :param view_url: The view_url of this FilterDetails.  # noqa: E501
        :type view_url: str
        """
        self.openapi_types = {
            'description': str,
            'edit_permissions': List[SharePermission],
            'expand': str,
            'favourite': bool,
            'favourited_count': int,
            'id': str,
            'jql': str,
            'name': str,
            'owner': FilterDetailsOwner,
            'search_url': str,
            '_self': str,
            'share_permissions': List[SharePermission],
            'subscriptions': List[FilterSubscription],
            'view_url': str
        }

        self.attribute_map = {
            'description': 'description',
            'edit_permissions': 'editPermissions',
            'expand': 'expand',
            'favourite': 'favourite',
            'favourited_count': 'favouritedCount',
            'id': 'id',
            'jql': 'jql',
            'name': 'name',
            'owner': 'owner',
            'search_url': 'searchUrl',
            '_self': 'self',
            'share_permissions': 'sharePermissions',
            'subscriptions': 'subscriptions',
            'view_url': 'viewUrl'
        }

        self._description = description
        self._edit_permissions = edit_permissions
        self._expand = expand
        self._favourite = favourite
        self._favourited_count = favourited_count
        self._id = id
        self._jql = jql
        self._name = name
        self._owner = owner
        self._search_url = search_url
        self.__self = _self
        self._share_permissions = share_permissions
        self._subscriptions = subscriptions
        self._view_url = view_url

    @classmethod
    def from_dict(cls, dikt) -> 'FilterDetails':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The FilterDetails of this FilterDetails.  # noqa: E501
        :rtype: FilterDetails
        """
        return util.deserialize_model(dikt, cls)

    @property
    def description(self) -> str:
        """Gets the description of this FilterDetails.

        The description of the filter.  # noqa: E501

        :return: The description of this FilterDetails.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this FilterDetails.

        The description of the filter.  # noqa: E501

        :param description: The description of this FilterDetails.
        :type description: str
        """

        self._description = description

    @property
    def edit_permissions(self) -> List[SharePermission]:
        """Gets the edit_permissions of this FilterDetails.

        The groups and projects that can edit the filter. This can be specified when updating a filter, but not when creating a filter.  # noqa: E501

        :return: The edit_permissions of this FilterDetails.
        :rtype: List[SharePermission]
        """
        return self._edit_permissions

    @edit_permissions.setter
    def edit_permissions(self, edit_permissions: List[SharePermission]):
        """Sets the edit_permissions of this FilterDetails.

        The groups and projects that can edit the filter. This can be specified when updating a filter, but not when creating a filter.  # noqa: E501

        :param edit_permissions: The edit_permissions of this FilterDetails.
        :type edit_permissions: List[SharePermission]
        """

        self._edit_permissions = edit_permissions

    @property
    def expand(self) -> str:
        """Gets the expand of this FilterDetails.

        Expand options that include additional filter details in the response.  # noqa: E501

        :return: The expand of this FilterDetails.
        :rtype: str
        """
        return self._expand

    @expand.setter
    def expand(self, expand: str):
        """Sets the expand of this FilterDetails.

        Expand options that include additional filter details in the response.  # noqa: E501

        :param expand: The expand of this FilterDetails.
        :type expand: str
        """

        self._expand = expand

    @property
    def favourite(self) -> bool:
        """Gets the favourite of this FilterDetails.

        Whether the filter is selected as a favorite by any users, not including the filter owner.  # noqa: E501

        :return: The favourite of this FilterDetails.
        :rtype: bool
        """
        return self._favourite

    @favourite.setter
    def favourite(self, favourite: bool):
        """Sets the favourite of this FilterDetails.

        Whether the filter is selected as a favorite by any users, not including the filter owner.  # noqa: E501

        :param favourite: The favourite of this FilterDetails.
        :type favourite: bool
        """

        self._favourite = favourite

    @property
    def favourited_count(self) -> int:
        """Gets the favourited_count of this FilterDetails.

        The count of how many users have selected this filter as a favorite, including the filter owner.  # noqa: E501

        :return: The favourited_count of this FilterDetails.
        :rtype: int
        """
        return self._favourited_count

    @favourited_count.setter
    def favourited_count(self, favourited_count: int):
        """Sets the favourited_count of this FilterDetails.

        The count of how many users have selected this filter as a favorite, including the filter owner.  # noqa: E501

        :param favourited_count: The favourited_count of this FilterDetails.
        :type favourited_count: int
        """

        self._favourited_count = favourited_count

    @property
    def id(self) -> str:
        """Gets the id of this FilterDetails.

        The unique identifier for the filter.  # noqa: E501

        :return: The id of this FilterDetails.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this FilterDetails.

        The unique identifier for the filter.  # noqa: E501

        :param id: The id of this FilterDetails.
        :type id: str
        """

        self._id = id

    @property
    def jql(self) -> str:
        """Gets the jql of this FilterDetails.

        The JQL query for the filter. For example, *project = SSP AND issuetype = Bug*.  # noqa: E501

        :return: The jql of this FilterDetails.
        :rtype: str
        """
        return self._jql

    @jql.setter
    def jql(self, jql: str):
        """Sets the jql of this FilterDetails.

        The JQL query for the filter. For example, *project = SSP AND issuetype = Bug*.  # noqa: E501

        :param jql: The jql of this FilterDetails.
        :type jql: str
        """

        self._jql = jql

    @property
    def name(self) -> str:
        """Gets the name of this FilterDetails.

        The name of the filter.  # noqa: E501

        :return: The name of this FilterDetails.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this FilterDetails.

        The name of the filter.  # noqa: E501

        :param name: The name of this FilterDetails.
        :type name: str
        """
        if name is None:
            raise ValueError("Invalid value for `name`, must not be `None`")  # noqa: E501

        self._name = name

    @property
    def owner(self) -> FilterDetailsOwner:
        """Gets the owner of this FilterDetails.


        :return: The owner of this FilterDetails.
        :rtype: FilterDetailsOwner
        """
        return self._owner

    @owner.setter
    def owner(self, owner: FilterDetailsOwner):
        """Sets the owner of this FilterDetails.


        :param owner: The owner of this FilterDetails.
        :type owner: FilterDetailsOwner
        """

        self._owner = owner

    @property
    def search_url(self) -> str:
        """Gets the search_url of this FilterDetails.

        A URL to view the filter results in Jira, using the [Search for issues using JQL](#api-rest-api-3-filter-search-get) operation with the filter's JQL string to return the filter results. For example, *https://your-domain.atlassian.net/rest/api/3/search?jql=project+%3D+SSP+AND+issuetype+%3D+Bug*.  # noqa: E501

        :return: The search_url of this FilterDetails.
        :rtype: str
        """
        return self._search_url

    @search_url.setter
    def search_url(self, search_url: str):
        """Sets the search_url of this FilterDetails.

        A URL to view the filter results in Jira, using the [Search for issues using JQL](#api-rest-api-3-filter-search-get) operation with the filter's JQL string to return the filter results. For example, *https://your-domain.atlassian.net/rest/api/3/search?jql=project+%3D+SSP+AND+issuetype+%3D+Bug*.  # noqa: E501

        :param search_url: The search_url of this FilterDetails.
        :type search_url: str
        """

        self._search_url = search_url

    @property
    def _self(self) -> str:
        """Gets the _self of this FilterDetails.

        The URL of the filter.  # noqa: E501

        :return: The _self of this FilterDetails.
        :rtype: str
        """
        return self.__self

    @_self.setter
    def _self(self, _self: str):
        """Sets the _self of this FilterDetails.

        The URL of the filter.  # noqa: E501

        :param _self: The _self of this FilterDetails.
        :type _self: str
        """

        self.__self = _self

    @property
    def share_permissions(self) -> List[SharePermission]:
        """Gets the share_permissions of this FilterDetails.

        The groups and projects that the filter is shared with. This can be specified when updating a filter, but not when creating a filter.  # noqa: E501

        :return: The share_permissions of this FilterDetails.
        :rtype: List[SharePermission]
        """
        return self._share_permissions

    @share_permissions.setter
    def share_permissions(self, share_permissions: List[SharePermission]):
        """Sets the share_permissions of this FilterDetails.

        The groups and projects that the filter is shared with. This can be specified when updating a filter, but not when creating a filter.  # noqa: E501

        :param share_permissions: The share_permissions of this FilterDetails.
        :type share_permissions: List[SharePermission]
        """

        self._share_permissions = share_permissions

    @property
    def subscriptions(self) -> List[FilterSubscription]:
        """Gets the subscriptions of this FilterDetails.

        The users that are subscribed to the filter.  # noqa: E501

        :return: The subscriptions of this FilterDetails.
        :rtype: List[FilterSubscription]
        """
        return self._subscriptions

    @subscriptions.setter
    def subscriptions(self, subscriptions: List[FilterSubscription]):
        """Sets the subscriptions of this FilterDetails.

        The users that are subscribed to the filter.  # noqa: E501

        :param subscriptions: The subscriptions of this FilterDetails.
        :type subscriptions: List[FilterSubscription]
        """

        self._subscriptions = subscriptions

    @property
    def view_url(self) -> str:
        """Gets the view_url of this FilterDetails.

        A URL to view the filter results in Jira, using the ID of the filter. For example, *https://your-domain.atlassian.net/issues/?filter=10100*.  # noqa: E501

        :return: The view_url of this FilterDetails.
        :rtype: str
        """
        return self._view_url

    @view_url.setter
    def view_url(self, view_url: str):
        """Sets the view_url of this FilterDetails.

        A URL to view the filter results in Jira, using the ID of the filter. For example, *https://your-domain.atlassian.net/issues/?filter=10100*.  # noqa: E501

        :param view_url: The view_url of this FilterDetails.
        :type view_url: str
        """

        self._view_url = view_url