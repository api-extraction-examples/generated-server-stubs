from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class SharePermissionInputBean(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, account_id=None, group_id=None, groupname=None, project_id=None, project_role_id=None, rights=None, type=None):  # noqa: E501
        """SharePermissionInputBean - a model defined in OpenAPI

        :param account_id: The account_id of this SharePermissionInputBean.  # noqa: E501
        :type account_id: str
        :param group_id: The group_id of this SharePermissionInputBean.  # noqa: E501
        :type group_id: str
        :param groupname: The groupname of this SharePermissionInputBean.  # noqa: E501
        :type groupname: str
        :param project_id: The project_id of this SharePermissionInputBean.  # noqa: E501
        :type project_id: str
        :param project_role_id: The project_role_id of this SharePermissionInputBean.  # noqa: E501
        :type project_role_id: str
        :param rights: The rights of this SharePermissionInputBean.  # noqa: E501
        :type rights: int
        :param type: The type of this SharePermissionInputBean.  # noqa: E501
        :type type: str
        """
        self.openapi_types = {
            'account_id': str,
            'group_id': str,
            'groupname': str,
            'project_id': str,
            'project_role_id': str,
            'rights': int,
            'type': str
        }

        self.attribute_map = {
            'account_id': 'accountId',
            'group_id': 'groupId',
            'groupname': 'groupname',
            'project_id': 'projectId',
            'project_role_id': 'projectRoleId',
            'rights': 'rights',
            'type': 'type'
        }

        self._account_id = account_id
        self._group_id = group_id
        self._groupname = groupname
        self._project_id = project_id
        self._project_role_id = project_role_id
        self._rights = rights
        self._type = type

    @classmethod
    def from_dict(cls, dikt) -> 'SharePermissionInputBean':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The SharePermissionInputBean of this SharePermissionInputBean.  # noqa: E501
        :rtype: SharePermissionInputBean
        """
        return util.deserialize_model(dikt, cls)

    @property
    def account_id(self) -> str:
        """Gets the account_id of this SharePermissionInputBean.

        The user account ID that the filter is shared with. For a request, specify the `accountId` property for the user.  # noqa: E501

        :return: The account_id of this SharePermissionInputBean.
        :rtype: str
        """
        return self._account_id

    @account_id.setter
    def account_id(self, account_id: str):
        """Sets the account_id of this SharePermissionInputBean.

        The user account ID that the filter is shared with. For a request, specify the `accountId` property for the user.  # noqa: E501

        :param account_id: The account_id of this SharePermissionInputBean.
        :type account_id: str
        """

        self._account_id = account_id

    @property
    def group_id(self) -> str:
        """Gets the group_id of this SharePermissionInputBean.

        The ID of the group, which uniquely identifies the group across all Atlassian products.For example, *952d12c3-5b5b-4d04-bb32-44d383afc4b2*. Cannot be provided with `groupname`.  # noqa: E501

        :return: The group_id of this SharePermissionInputBean.
        :rtype: str
        """
        return self._group_id

    @group_id.setter
    def group_id(self, group_id: str):
        """Sets the group_id of this SharePermissionInputBean.

        The ID of the group, which uniquely identifies the group across all Atlassian products.For example, *952d12c3-5b5b-4d04-bb32-44d383afc4b2*. Cannot be provided with `groupname`.  # noqa: E501

        :param group_id: The group_id of this SharePermissionInputBean.
        :type group_id: str
        """

        self._group_id = group_id

    @property
    def groupname(self) -> str:
        """Gets the groupname of this SharePermissionInputBean.

        The name of the group to share the filter with. Set `type` to `group`. Please note that the name of a group is mutable, to reliably identify a group use `groupId`.  # noqa: E501

        :return: The groupname of this SharePermissionInputBean.
        :rtype: str
        """
        return self._groupname

    @groupname.setter
    def groupname(self, groupname: str):
        """Sets the groupname of this SharePermissionInputBean.

        The name of the group to share the filter with. Set `type` to `group`. Please note that the name of a group is mutable, to reliably identify a group use `groupId`.  # noqa: E501

        :param groupname: The groupname of this SharePermissionInputBean.
        :type groupname: str
        """

        self._groupname = groupname

    @property
    def project_id(self) -> str:
        """Gets the project_id of this SharePermissionInputBean.

        The ID of the project to share the filter with. Set `type` to `project`.  # noqa: E501

        :return: The project_id of this SharePermissionInputBean.
        :rtype: str
        """
        return self._project_id

    @project_id.setter
    def project_id(self, project_id: str):
        """Sets the project_id of this SharePermissionInputBean.

        The ID of the project to share the filter with. Set `type` to `project`.  # noqa: E501

        :param project_id: The project_id of this SharePermissionInputBean.
        :type project_id: str
        """

        self._project_id = project_id

    @property
    def project_role_id(self) -> str:
        """Gets the project_role_id of this SharePermissionInputBean.

        The ID of the project role to share the filter with. Set `type` to `projectRole` and the `projectId` for the project that the role is in.  # noqa: E501

        :return: The project_role_id of this SharePermissionInputBean.
        :rtype: str
        """
        return self._project_role_id

    @project_role_id.setter
    def project_role_id(self, project_role_id: str):
        """Sets the project_role_id of this SharePermissionInputBean.

        The ID of the project role to share the filter with. Set `type` to `projectRole` and the `projectId` for the project that the role is in.  # noqa: E501

        :param project_role_id: The project_role_id of this SharePermissionInputBean.
        :type project_role_id: str
        """

        self._project_role_id = project_role_id

    @property
    def rights(self) -> int:
        """Gets the rights of this SharePermissionInputBean.

        The rights for the share permission.  # noqa: E501

        :return: The rights of this SharePermissionInputBean.
        :rtype: int
        """
        return self._rights

    @rights.setter
    def rights(self, rights: int):
        """Sets the rights of this SharePermissionInputBean.

        The rights for the share permission.  # noqa: E501

        :param rights: The rights of this SharePermissionInputBean.
        :type rights: int
        """

        self._rights = rights

    @property
    def type(self) -> str:
        """Gets the type of this SharePermissionInputBean.

        The type of the share permission.Specify the type as follows:   *  `user` Share with a user.  *  `group` Share with a group. Specify `groupname` as well.  *  `project` Share with a project. Specify `projectId` as well.  *  `projectRole` Share with a project role in a project. Specify `projectId` and `projectRoleId` as well.  *  `global` Share globally, including anonymous users. If set, this type overrides all existing share permissions and must be deleted before any non-global share permissions is set.  *  `authenticated` Share with all logged-in users. This shows as `loggedin` in the response. If set, this type overrides all existing share permissions and must be deleted before any non-global share permissions is set.  # noqa: E501

        :return: The type of this SharePermissionInputBean.
        :rtype: str
        """
        return self._type

    @type.setter
    def type(self, type: str):
        """Sets the type of this SharePermissionInputBean.

        The type of the share permission.Specify the type as follows:   *  `user` Share with a user.  *  `group` Share with a group. Specify `groupname` as well.  *  `project` Share with a project. Specify `projectId` as well.  *  `projectRole` Share with a project role in a project. Specify `projectId` and `projectRoleId` as well.  *  `global` Share globally, including anonymous users. If set, this type overrides all existing share permissions and must be deleted before any non-global share permissions is set.  *  `authenticated` Share with all logged-in users. This shows as `loggedin` in the response. If set, this type overrides all existing share permissions and must be deleted before any non-global share permissions is set.  # noqa: E501

        :param type: The type of this SharePermissionInputBean.
        :type type: str
        """
        allowed_values = ["user", "project", "group", "projectRole", "global", "authenticated"]  # noqa: E501
        if type not in allowed_values:
            raise ValueError(
                "Invalid value for `type` ({0}), must be one of {1}"
                .format(type, allowed_values)
            )

        self._type = type