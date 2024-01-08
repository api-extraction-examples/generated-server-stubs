from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.user_compact import UserCompact
from openapi_server.models.user_task_list_compact import UserTaskListCompact
from openapi_server.models.workspace_compact import WorkspaceCompact
from openapi_server.models.workspace_membership_response_all_of_vacation_dates import WorkspaceMembershipResponseAllOfVacationDates
from openapi_server import util

from openapi_server.models.user_compact import UserCompact  # noqa: E501
from openapi_server.models.user_task_list_compact import UserTaskListCompact  # noqa: E501
from openapi_server.models.workspace_compact import WorkspaceCompact  # noqa: E501
from openapi_server.models.workspace_membership_response_all_of_vacation_dates import WorkspaceMembershipResponseAllOfVacationDates  # noqa: E501

class WorkspaceMembershipResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, gid=None, resource_type=None, user=None, workspace=None, is_active=None, is_admin=None, is_guest=None, user_task_list=None, vacation_dates=None):  # noqa: E501
        """WorkspaceMembershipResponse - a model defined in OpenAPI

        :param gid: The gid of this WorkspaceMembershipResponse.  # noqa: E501
        :type gid: str
        :param resource_type: The resource_type of this WorkspaceMembershipResponse.  # noqa: E501
        :type resource_type: str
        :param user: The user of this WorkspaceMembershipResponse.  # noqa: E501
        :type user: UserCompact
        :param workspace: The workspace of this WorkspaceMembershipResponse.  # noqa: E501
        :type workspace: WorkspaceCompact
        :param is_active: The is_active of this WorkspaceMembershipResponse.  # noqa: E501
        :type is_active: bool
        :param is_admin: The is_admin of this WorkspaceMembershipResponse.  # noqa: E501
        :type is_admin: bool
        :param is_guest: The is_guest of this WorkspaceMembershipResponse.  # noqa: E501
        :type is_guest: bool
        :param user_task_list: The user_task_list of this WorkspaceMembershipResponse.  # noqa: E501
        :type user_task_list: UserTaskListCompact
        :param vacation_dates: The vacation_dates of this WorkspaceMembershipResponse.  # noqa: E501
        :type vacation_dates: WorkspaceMembershipResponseAllOfVacationDates
        """
        self.openapi_types = {
            'gid': str,
            'resource_type': str,
            'user': UserCompact,
            'workspace': WorkspaceCompact,
            'is_active': bool,
            'is_admin': bool,
            'is_guest': bool,
            'user_task_list': UserTaskListCompact,
            'vacation_dates': WorkspaceMembershipResponseAllOfVacationDates
        }

        self.attribute_map = {
            'gid': 'gid',
            'resource_type': 'resource_type',
            'user': 'user',
            'workspace': 'workspace',
            'is_active': 'is_active',
            'is_admin': 'is_admin',
            'is_guest': 'is_guest',
            'user_task_list': 'user_task_list',
            'vacation_dates': 'vacation_dates'
        }

        self._gid = gid
        self._resource_type = resource_type
        self._user = user
        self._workspace = workspace
        self._is_active = is_active
        self._is_admin = is_admin
        self._is_guest = is_guest
        self._user_task_list = user_task_list
        self._vacation_dates = vacation_dates

    @classmethod
    def from_dict(cls, dikt) -> 'WorkspaceMembershipResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The WorkspaceMembershipResponse of this WorkspaceMembershipResponse.  # noqa: E501
        :rtype: WorkspaceMembershipResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def gid(self) -> str:
        """Gets the gid of this WorkspaceMembershipResponse.

        Globally unique identifier of the resource, as a string.  # noqa: E501

        :return: The gid of this WorkspaceMembershipResponse.
        :rtype: str
        """
        return self._gid

    @gid.setter
    def gid(self, gid: str):
        """Sets the gid of this WorkspaceMembershipResponse.

        Globally unique identifier of the resource, as a string.  # noqa: E501

        :param gid: The gid of this WorkspaceMembershipResponse.
        :type gid: str
        """

        self._gid = gid

    @property
    def resource_type(self) -> str:
        """Gets the resource_type of this WorkspaceMembershipResponse.

        The base type of this resource.  # noqa: E501

        :return: The resource_type of this WorkspaceMembershipResponse.
        :rtype: str
        """
        return self._resource_type

    @resource_type.setter
    def resource_type(self, resource_type: str):
        """Sets the resource_type of this WorkspaceMembershipResponse.

        The base type of this resource.  # noqa: E501

        :param resource_type: The resource_type of this WorkspaceMembershipResponse.
        :type resource_type: str
        """

        self._resource_type = resource_type

    @property
    def user(self) -> UserCompact:
        """Gets the user of this WorkspaceMembershipResponse.


        :return: The user of this WorkspaceMembershipResponse.
        :rtype: UserCompact
        """
        return self._user

    @user.setter
    def user(self, user: UserCompact):
        """Sets the user of this WorkspaceMembershipResponse.


        :param user: The user of this WorkspaceMembershipResponse.
        :type user: UserCompact
        """

        self._user = user

    @property
    def workspace(self) -> WorkspaceCompact:
        """Gets the workspace of this WorkspaceMembershipResponse.


        :return: The workspace of this WorkspaceMembershipResponse.
        :rtype: WorkspaceCompact
        """
        return self._workspace

    @workspace.setter
    def workspace(self, workspace: WorkspaceCompact):
        """Sets the workspace of this WorkspaceMembershipResponse.


        :param workspace: The workspace of this WorkspaceMembershipResponse.
        :type workspace: WorkspaceCompact
        """

        self._workspace = workspace

    @property
    def is_active(self) -> bool:
        """Gets the is_active of this WorkspaceMembershipResponse.

        Reflects if this user still a member of the workspace.  # noqa: E501

        :return: The is_active of this WorkspaceMembershipResponse.
        :rtype: bool
        """
        return self._is_active

    @is_active.setter
    def is_active(self, is_active: bool):
        """Sets the is_active of this WorkspaceMembershipResponse.

        Reflects if this user still a member of the workspace.  # noqa: E501

        :param is_active: The is_active of this WorkspaceMembershipResponse.
        :type is_active: bool
        """

        self._is_active = is_active

    @property
    def is_admin(self) -> bool:
        """Gets the is_admin of this WorkspaceMembershipResponse.

        Reflects if this user is an admin of the workspace.  # noqa: E501

        :return: The is_admin of this WorkspaceMembershipResponse.
        :rtype: bool
        """
        return self._is_admin

    @is_admin.setter
    def is_admin(self, is_admin: bool):
        """Sets the is_admin of this WorkspaceMembershipResponse.

        Reflects if this user is an admin of the workspace.  # noqa: E501

        :param is_admin: The is_admin of this WorkspaceMembershipResponse.
        :type is_admin: bool
        """

        self._is_admin = is_admin

    @property
    def is_guest(self) -> bool:
        """Gets the is_guest of this WorkspaceMembershipResponse.

        Reflects if this user is a guest of the workspace.  # noqa: E501

        :return: The is_guest of this WorkspaceMembershipResponse.
        :rtype: bool
        """
        return self._is_guest

    @is_guest.setter
    def is_guest(self, is_guest: bool):
        """Sets the is_guest of this WorkspaceMembershipResponse.

        Reflects if this user is a guest of the workspace.  # noqa: E501

        :param is_guest: The is_guest of this WorkspaceMembershipResponse.
        :type is_guest: bool
        """

        self._is_guest = is_guest

    @property
    def user_task_list(self) -> UserTaskListCompact:
        """Gets the user_task_list of this WorkspaceMembershipResponse.


        :return: The user_task_list of this WorkspaceMembershipResponse.
        :rtype: UserTaskListCompact
        """
        return self._user_task_list

    @user_task_list.setter
    def user_task_list(self, user_task_list: UserTaskListCompact):
        """Sets the user_task_list of this WorkspaceMembershipResponse.


        :param user_task_list: The user_task_list of this WorkspaceMembershipResponse.
        :type user_task_list: UserTaskListCompact
        """

        self._user_task_list = user_task_list

    @property
    def vacation_dates(self) -> WorkspaceMembershipResponseAllOfVacationDates:
        """Gets the vacation_dates of this WorkspaceMembershipResponse.


        :return: The vacation_dates of this WorkspaceMembershipResponse.
        :rtype: WorkspaceMembershipResponseAllOfVacationDates
        """
        return self._vacation_dates

    @vacation_dates.setter
    def vacation_dates(self, vacation_dates: WorkspaceMembershipResponseAllOfVacationDates):
        """Sets the vacation_dates of this WorkspaceMembershipResponse.


        :param vacation_dates: The vacation_dates of this WorkspaceMembershipResponse.
        :type vacation_dates: WorkspaceMembershipResponseAllOfVacationDates
        """

        self._vacation_dates = vacation_dates
