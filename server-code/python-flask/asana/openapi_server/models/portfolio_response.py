from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.custom_field_compact import CustomFieldCompact
from openapi_server.models.custom_field_setting_response import CustomFieldSettingResponse
from openapi_server.models.portfolio_response_all_of_current_status_update import PortfolioResponseAllOfCurrentStatusUpdate
from openapi_server.models.portfolio_response_all_of_workspace import PortfolioResponseAllOfWorkspace
from openapi_server.models.user_compact import UserCompact
from openapi_server import util

from openapi_server.models.custom_field_compact import CustomFieldCompact  # noqa: E501
from openapi_server.models.custom_field_setting_response import CustomFieldSettingResponse  # noqa: E501
from openapi_server.models.portfolio_response_all_of_current_status_update import PortfolioResponseAllOfCurrentStatusUpdate  # noqa: E501
from openapi_server.models.portfolio_response_all_of_workspace import PortfolioResponseAllOfWorkspace  # noqa: E501
from openapi_server.models.user_compact import UserCompact  # noqa: E501

class PortfolioResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, gid=None, resource_type=None, name=None, color=None, created_at=None, created_by=None, current_status_update=None, custom_field_settings=None, custom_fields=None, due_on=None, members=None, owner=None, permalink_url=None, public=None, start_on=None, workspace=None):  # noqa: E501
        """PortfolioResponse - a model defined in OpenAPI

        :param gid: The gid of this PortfolioResponse.  # noqa: E501
        :type gid: str
        :param resource_type: The resource_type of this PortfolioResponse.  # noqa: E501
        :type resource_type: str
        :param name: The name of this PortfolioResponse.  # noqa: E501
        :type name: str
        :param color: The color of this PortfolioResponse.  # noqa: E501
        :type color: str
        :param created_at: The created_at of this PortfolioResponse.  # noqa: E501
        :type created_at: datetime
        :param created_by: The created_by of this PortfolioResponse.  # noqa: E501
        :type created_by: UserCompact
        :param current_status_update: The current_status_update of this PortfolioResponse.  # noqa: E501
        :type current_status_update: PortfolioResponseAllOfCurrentStatusUpdate
        :param custom_field_settings: The custom_field_settings of this PortfolioResponse.  # noqa: E501
        :type custom_field_settings: List[CustomFieldSettingResponse]
        :param custom_fields: The custom_fields of this PortfolioResponse.  # noqa: E501
        :type custom_fields: List[CustomFieldCompact]
        :param due_on: The due_on of this PortfolioResponse.  # noqa: E501
        :type due_on: datetime
        :param members: The members of this PortfolioResponse.  # noqa: E501
        :type members: List[UserCompact]
        :param owner: The owner of this PortfolioResponse.  # noqa: E501
        :type owner: UserCompact
        :param permalink_url: The permalink_url of this PortfolioResponse.  # noqa: E501
        :type permalink_url: str
        :param public: The public of this PortfolioResponse.  # noqa: E501
        :type public: bool
        :param start_on: The start_on of this PortfolioResponse.  # noqa: E501
        :type start_on: date
        :param workspace: The workspace of this PortfolioResponse.  # noqa: E501
        :type workspace: PortfolioResponseAllOfWorkspace
        """
        self.openapi_types = {
            'gid': str,
            'resource_type': str,
            'name': str,
            'color': str,
            'created_at': datetime,
            'created_by': UserCompact,
            'current_status_update': PortfolioResponseAllOfCurrentStatusUpdate,
            'custom_field_settings': List[CustomFieldSettingResponse],
            'custom_fields': List[CustomFieldCompact],
            'due_on': datetime,
            'members': List[UserCompact],
            'owner': UserCompact,
            'permalink_url': str,
            'public': bool,
            'start_on': date,
            'workspace': PortfolioResponseAllOfWorkspace
        }

        self.attribute_map = {
            'gid': 'gid',
            'resource_type': 'resource_type',
            'name': 'name',
            'color': 'color',
            'created_at': 'created_at',
            'created_by': 'created_by',
            'current_status_update': 'current_status_update',
            'custom_field_settings': 'custom_field_settings',
            'custom_fields': 'custom_fields',
            'due_on': 'due_on',
            'members': 'members',
            'owner': 'owner',
            'permalink_url': 'permalink_url',
            'public': 'public',
            'start_on': 'start_on',
            'workspace': 'workspace'
        }

        self._gid = gid
        self._resource_type = resource_type
        self._name = name
        self._color = color
        self._created_at = created_at
        self._created_by = created_by
        self._current_status_update = current_status_update
        self._custom_field_settings = custom_field_settings
        self._custom_fields = custom_fields
        self._due_on = due_on
        self._members = members
        self._owner = owner
        self._permalink_url = permalink_url
        self._public = public
        self._start_on = start_on
        self._workspace = workspace

    @classmethod
    def from_dict(cls, dikt) -> 'PortfolioResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PortfolioResponse of this PortfolioResponse.  # noqa: E501
        :rtype: PortfolioResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def gid(self) -> str:
        """Gets the gid of this PortfolioResponse.

        Globally unique identifier of the resource, as a string.  # noqa: E501

        :return: The gid of this PortfolioResponse.
        :rtype: str
        """
        return self._gid

    @gid.setter
    def gid(self, gid: str):
        """Sets the gid of this PortfolioResponse.

        Globally unique identifier of the resource, as a string.  # noqa: E501

        :param gid: The gid of this PortfolioResponse.
        :type gid: str
        """

        self._gid = gid

    @property
    def resource_type(self) -> str:
        """Gets the resource_type of this PortfolioResponse.

        The base type of this resource.  # noqa: E501

        :return: The resource_type of this PortfolioResponse.
        :rtype: str
        """
        return self._resource_type

    @resource_type.setter
    def resource_type(self, resource_type: str):
        """Sets the resource_type of this PortfolioResponse.

        The base type of this resource.  # noqa: E501

        :param resource_type: The resource_type of this PortfolioResponse.
        :type resource_type: str
        """

        self._resource_type = resource_type

    @property
    def name(self) -> str:
        """Gets the name of this PortfolioResponse.

        The name of the portfolio.  # noqa: E501

        :return: The name of this PortfolioResponse.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this PortfolioResponse.

        The name of the portfolio.  # noqa: E501

        :param name: The name of this PortfolioResponse.
        :type name: str
        """

        self._name = name

    @property
    def color(self) -> str:
        """Gets the color of this PortfolioResponse.

        Color of the portfolio.  # noqa: E501

        :return: The color of this PortfolioResponse.
        :rtype: str
        """
        return self._color

    @color.setter
    def color(self, color: str):
        """Sets the color of this PortfolioResponse.

        Color of the portfolio.  # noqa: E501

        :param color: The color of this PortfolioResponse.
        :type color: str
        """
        allowed_values = ["dark-pink", "dark-green", "dark-blue", "dark-red", "dark-teal", "dark-brown", "dark-orange", "dark-purple", "dark-warm-gray", "light-pink", "light-green", "light-blue", "light-red", "light-teal", "light-brown", "light-orange", "light-purple", "light-warm-gray"]  # noqa: E501
        if color not in allowed_values:
            raise ValueError(
                "Invalid value for `color` ({0}), must be one of {1}"
                .format(color, allowed_values)
            )

        self._color = color

    @property
    def created_at(self) -> datetime:
        """Gets the created_at of this PortfolioResponse.

        The time at which this resource was created.  # noqa: E501

        :return: The created_at of this PortfolioResponse.
        :rtype: datetime
        """
        return self._created_at

    @created_at.setter
    def created_at(self, created_at: datetime):
        """Sets the created_at of this PortfolioResponse.

        The time at which this resource was created.  # noqa: E501

        :param created_at: The created_at of this PortfolioResponse.
        :type created_at: datetime
        """

        self._created_at = created_at

    @property
    def created_by(self) -> UserCompact:
        """Gets the created_by of this PortfolioResponse.


        :return: The created_by of this PortfolioResponse.
        :rtype: UserCompact
        """
        return self._created_by

    @created_by.setter
    def created_by(self, created_by: UserCompact):
        """Sets the created_by of this PortfolioResponse.


        :param created_by: The created_by of this PortfolioResponse.
        :type created_by: UserCompact
        """

        self._created_by = created_by

    @property
    def current_status_update(self) -> PortfolioResponseAllOfCurrentStatusUpdate:
        """Gets the current_status_update of this PortfolioResponse.


        :return: The current_status_update of this PortfolioResponse.
        :rtype: PortfolioResponseAllOfCurrentStatusUpdate
        """
        return self._current_status_update

    @current_status_update.setter
    def current_status_update(self, current_status_update: PortfolioResponseAllOfCurrentStatusUpdate):
        """Sets the current_status_update of this PortfolioResponse.


        :param current_status_update: The current_status_update of this PortfolioResponse.
        :type current_status_update: PortfolioResponseAllOfCurrentStatusUpdate
        """

        self._current_status_update = current_status_update

    @property
    def custom_field_settings(self) -> List[CustomFieldSettingResponse]:
        """Gets the custom_field_settings of this PortfolioResponse.

        Array of custom field settings applied to the portfolio.  # noqa: E501

        :return: The custom_field_settings of this PortfolioResponse.
        :rtype: List[CustomFieldSettingResponse]
        """
        return self._custom_field_settings

    @custom_field_settings.setter
    def custom_field_settings(self, custom_field_settings: List[CustomFieldSettingResponse]):
        """Sets the custom_field_settings of this PortfolioResponse.

        Array of custom field settings applied to the portfolio.  # noqa: E501

        :param custom_field_settings: The custom_field_settings of this PortfolioResponse.
        :type custom_field_settings: List[CustomFieldSettingResponse]
        """

        self._custom_field_settings = custom_field_settings

    @property
    def custom_fields(self) -> List[CustomFieldCompact]:
        """Gets the custom_fields of this PortfolioResponse.

        Array of Custom Fields.  # noqa: E501

        :return: The custom_fields of this PortfolioResponse.
        :rtype: List[CustomFieldCompact]
        """
        return self._custom_fields

    @custom_fields.setter
    def custom_fields(self, custom_fields: List[CustomFieldCompact]):
        """Sets the custom_fields of this PortfolioResponse.

        Array of Custom Fields.  # noqa: E501

        :param custom_fields: The custom_fields of this PortfolioResponse.
        :type custom_fields: List[CustomFieldCompact]
        """

        self._custom_fields = custom_fields

    @property
    def due_on(self) -> datetime:
        """Gets the due_on of this PortfolioResponse.

        The localized day on which this portfolio is due. This takes a date with format YYYY-MM-DD.  # noqa: E501

        :return: The due_on of this PortfolioResponse.
        :rtype: datetime
        """
        return self._due_on

    @due_on.setter
    def due_on(self, due_on: datetime):
        """Sets the due_on of this PortfolioResponse.

        The localized day on which this portfolio is due. This takes a date with format YYYY-MM-DD.  # noqa: E501

        :param due_on: The due_on of this PortfolioResponse.
        :type due_on: datetime
        """

        self._due_on = due_on

    @property
    def members(self) -> List[UserCompact]:
        """Gets the members of this PortfolioResponse.


        :return: The members of this PortfolioResponse.
        :rtype: List[UserCompact]
        """
        return self._members

    @members.setter
    def members(self, members: List[UserCompact]):
        """Sets the members of this PortfolioResponse.


        :param members: The members of this PortfolioResponse.
        :type members: List[UserCompact]
        """

        self._members = members

    @property
    def owner(self) -> UserCompact:
        """Gets the owner of this PortfolioResponse.


        :return: The owner of this PortfolioResponse.
        :rtype: UserCompact
        """
        return self._owner

    @owner.setter
    def owner(self, owner: UserCompact):
        """Sets the owner of this PortfolioResponse.


        :param owner: The owner of this PortfolioResponse.
        :type owner: UserCompact
        """

        self._owner = owner

    @property
    def permalink_url(self) -> str:
        """Gets the permalink_url of this PortfolioResponse.

        A url that points directly to the object within Asana.  # noqa: E501

        :return: The permalink_url of this PortfolioResponse.
        :rtype: str
        """
        return self._permalink_url

    @permalink_url.setter
    def permalink_url(self, permalink_url: str):
        """Sets the permalink_url of this PortfolioResponse.

        A url that points directly to the object within Asana.  # noqa: E501

        :param permalink_url: The permalink_url of this PortfolioResponse.
        :type permalink_url: str
        """

        self._permalink_url = permalink_url

    @property
    def public(self) -> bool:
        """Gets the public of this PortfolioResponse.

        True if the portfolio is public to its workspace members.  # noqa: E501

        :return: The public of this PortfolioResponse.
        :rtype: bool
        """
        return self._public

    @public.setter
    def public(self, public: bool):
        """Sets the public of this PortfolioResponse.

        True if the portfolio is public to its workspace members.  # noqa: E501

        :param public: The public of this PortfolioResponse.
        :type public: bool
        """

        self._public = public

    @property
    def start_on(self) -> date:
        """Gets the start_on of this PortfolioResponse.

        The day on which work for this portfolio begins, or null if the portfolio has no start date. This takes a date with `YYYY-MM-DD` format. *Note: `due_on` must be present in the request when setting or unsetting the `start_on` parameter. Additionally, `start_on` and `due_on` cannot be the same date.*  # noqa: E501

        :return: The start_on of this PortfolioResponse.
        :rtype: date
        """
        return self._start_on

    @start_on.setter
    def start_on(self, start_on: date):
        """Sets the start_on of this PortfolioResponse.

        The day on which work for this portfolio begins, or null if the portfolio has no start date. This takes a date with `YYYY-MM-DD` format. *Note: `due_on` must be present in the request when setting or unsetting the `start_on` parameter. Additionally, `start_on` and `due_on` cannot be the same date.*  # noqa: E501

        :param start_on: The start_on of this PortfolioResponse.
        :type start_on: date
        """

        self._start_on = start_on

    @property
    def workspace(self) -> PortfolioResponseAllOfWorkspace:
        """Gets the workspace of this PortfolioResponse.


        :return: The workspace of this PortfolioResponse.
        :rtype: PortfolioResponseAllOfWorkspace
        """
        return self._workspace

    @workspace.setter
    def workspace(self, workspace: PortfolioResponseAllOfWorkspace):
        """Sets the workspace of this PortfolioResponse.


        :param workspace: The workspace of this PortfolioResponse.
        :type workspace: PortfolioResponseAllOfWorkspace
        """

        self._workspace = workspace
