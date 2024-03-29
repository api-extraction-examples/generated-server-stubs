from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.role_permissions_boundary import RolePermissionsBoundary
from openapi_server.models.role_role_last_used import RoleRoleLastUsed
from openapi_server import util

from openapi_server.models.role_permissions_boundary import RolePermissionsBoundary  # noqa: E501
from openapi_server.models.role_role_last_used import RoleRoleLastUsed  # noqa: E501

class UpdateRoleDescriptionResponseRole(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, path=None, role_name=None, role_id=None, arn=None, create_date=None, assume_role_policy_document=None, description=None, max_session_duration=None, permissions_boundary=None, tags=None, role_last_used=None):  # noqa: E501
        """UpdateRoleDescriptionResponseRole - a model defined in OpenAPI

        :param path: The path of this UpdateRoleDescriptionResponseRole.  # noqa: E501
        :type path: str
        :param role_name: The role_name of this UpdateRoleDescriptionResponseRole.  # noqa: E501
        :type role_name: str
        :param role_id: The role_id of this UpdateRoleDescriptionResponseRole.  # noqa: E501
        :type role_id: str
        :param arn: The arn of this UpdateRoleDescriptionResponseRole.  # noqa: E501
        :type arn: str
        :param create_date: The create_date of this UpdateRoleDescriptionResponseRole.  # noqa: E501
        :type create_date: datetime
        :param assume_role_policy_document: The assume_role_policy_document of this UpdateRoleDescriptionResponseRole.  # noqa: E501
        :type assume_role_policy_document: str
        :param description: The description of this UpdateRoleDescriptionResponseRole.  # noqa: E501
        :type description: str
        :param max_session_duration: The max_session_duration of this UpdateRoleDescriptionResponseRole.  # noqa: E501
        :type max_session_duration: int
        :param permissions_boundary: The permissions_boundary of this UpdateRoleDescriptionResponseRole.  # noqa: E501
        :type permissions_boundary: RolePermissionsBoundary
        :param tags: The tags of this UpdateRoleDescriptionResponseRole.  # noqa: E501
        :type tags: List
        :param role_last_used: The role_last_used of this UpdateRoleDescriptionResponseRole.  # noqa: E501
        :type role_last_used: RoleRoleLastUsed
        """
        self.openapi_types = {
            'path': str,
            'role_name': str,
            'role_id': str,
            'arn': str,
            'create_date': datetime,
            'assume_role_policy_document': str,
            'description': str,
            'max_session_duration': int,
            'permissions_boundary': RolePermissionsBoundary,
            'tags': List,
            'role_last_used': RoleRoleLastUsed
        }

        self.attribute_map = {
            'path': 'Path',
            'role_name': 'RoleName',
            'role_id': 'RoleId',
            'arn': 'Arn',
            'create_date': 'CreateDate',
            'assume_role_policy_document': 'AssumeRolePolicyDocument',
            'description': 'Description',
            'max_session_duration': 'MaxSessionDuration',
            'permissions_boundary': 'PermissionsBoundary',
            'tags': 'Tags',
            'role_last_used': 'RoleLastUsed'
        }

        self._path = path
        self._role_name = role_name
        self._role_id = role_id
        self._arn = arn
        self._create_date = create_date
        self._assume_role_policy_document = assume_role_policy_document
        self._description = description
        self._max_session_duration = max_session_duration
        self._permissions_boundary = permissions_boundary
        self._tags = tags
        self._role_last_used = role_last_used

    @classmethod
    def from_dict(cls, dikt) -> 'UpdateRoleDescriptionResponseRole':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The UpdateRoleDescriptionResponse_Role of this UpdateRoleDescriptionResponseRole.  # noqa: E501
        :rtype: UpdateRoleDescriptionResponseRole
        """
        return util.deserialize_model(dikt, cls)

    @property
    def path(self) -> str:
        """Gets the path of this UpdateRoleDescriptionResponseRole.


        :return: The path of this UpdateRoleDescriptionResponseRole.
        :rtype: str
        """
        return self._path

    @path.setter
    def path(self, path: str):
        """Sets the path of this UpdateRoleDescriptionResponseRole.


        :param path: The path of this UpdateRoleDescriptionResponseRole.
        :type path: str
        """
        if path is None:
            raise ValueError("Invalid value for `path`, must not be `None`")  # noqa: E501

        self._path = path

    @property
    def role_name(self) -> str:
        """Gets the role_name of this UpdateRoleDescriptionResponseRole.


        :return: The role_name of this UpdateRoleDescriptionResponseRole.
        :rtype: str
        """
        return self._role_name

    @role_name.setter
    def role_name(self, role_name: str):
        """Sets the role_name of this UpdateRoleDescriptionResponseRole.


        :param role_name: The role_name of this UpdateRoleDescriptionResponseRole.
        :type role_name: str
        """
        if role_name is None:
            raise ValueError("Invalid value for `role_name`, must not be `None`")  # noqa: E501

        self._role_name = role_name

    @property
    def role_id(self) -> str:
        """Gets the role_id of this UpdateRoleDescriptionResponseRole.


        :return: The role_id of this UpdateRoleDescriptionResponseRole.
        :rtype: str
        """
        return self._role_id

    @role_id.setter
    def role_id(self, role_id: str):
        """Sets the role_id of this UpdateRoleDescriptionResponseRole.


        :param role_id: The role_id of this UpdateRoleDescriptionResponseRole.
        :type role_id: str
        """
        if role_id is None:
            raise ValueError("Invalid value for `role_id`, must not be `None`")  # noqa: E501

        self._role_id = role_id

    @property
    def arn(self) -> str:
        """Gets the arn of this UpdateRoleDescriptionResponseRole.


        :return: The arn of this UpdateRoleDescriptionResponseRole.
        :rtype: str
        """
        return self._arn

    @arn.setter
    def arn(self, arn: str):
        """Sets the arn of this UpdateRoleDescriptionResponseRole.


        :param arn: The arn of this UpdateRoleDescriptionResponseRole.
        :type arn: str
        """
        if arn is None:
            raise ValueError("Invalid value for `arn`, must not be `None`")  # noqa: E501

        self._arn = arn

    @property
    def create_date(self) -> datetime:
        """Gets the create_date of this UpdateRoleDescriptionResponseRole.


        :return: The create_date of this UpdateRoleDescriptionResponseRole.
        :rtype: datetime
        """
        return self._create_date

    @create_date.setter
    def create_date(self, create_date: datetime):
        """Sets the create_date of this UpdateRoleDescriptionResponseRole.


        :param create_date: The create_date of this UpdateRoleDescriptionResponseRole.
        :type create_date: datetime
        """
        if create_date is None:
            raise ValueError("Invalid value for `create_date`, must not be `None`")  # noqa: E501

        self._create_date = create_date

    @property
    def assume_role_policy_document(self) -> str:
        """Gets the assume_role_policy_document of this UpdateRoleDescriptionResponseRole.


        :return: The assume_role_policy_document of this UpdateRoleDescriptionResponseRole.
        :rtype: str
        """
        return self._assume_role_policy_document

    @assume_role_policy_document.setter
    def assume_role_policy_document(self, assume_role_policy_document: str):
        """Sets the assume_role_policy_document of this UpdateRoleDescriptionResponseRole.


        :param assume_role_policy_document: The assume_role_policy_document of this UpdateRoleDescriptionResponseRole.
        :type assume_role_policy_document: str
        """

        self._assume_role_policy_document = assume_role_policy_document

    @property
    def description(self) -> str:
        """Gets the description of this UpdateRoleDescriptionResponseRole.


        :return: The description of this UpdateRoleDescriptionResponseRole.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this UpdateRoleDescriptionResponseRole.


        :param description: The description of this UpdateRoleDescriptionResponseRole.
        :type description: str
        """

        self._description = description

    @property
    def max_session_duration(self) -> int:
        """Gets the max_session_duration of this UpdateRoleDescriptionResponseRole.


        :return: The max_session_duration of this UpdateRoleDescriptionResponseRole.
        :rtype: int
        """
        return self._max_session_duration

    @max_session_duration.setter
    def max_session_duration(self, max_session_duration: int):
        """Sets the max_session_duration of this UpdateRoleDescriptionResponseRole.


        :param max_session_duration: The max_session_duration of this UpdateRoleDescriptionResponseRole.
        :type max_session_duration: int
        """

        self._max_session_duration = max_session_duration

    @property
    def permissions_boundary(self) -> RolePermissionsBoundary:
        """Gets the permissions_boundary of this UpdateRoleDescriptionResponseRole.


        :return: The permissions_boundary of this UpdateRoleDescriptionResponseRole.
        :rtype: RolePermissionsBoundary
        """
        return self._permissions_boundary

    @permissions_boundary.setter
    def permissions_boundary(self, permissions_boundary: RolePermissionsBoundary):
        """Sets the permissions_boundary of this UpdateRoleDescriptionResponseRole.


        :param permissions_boundary: The permissions_boundary of this UpdateRoleDescriptionResponseRole.
        :type permissions_boundary: RolePermissionsBoundary
        """

        self._permissions_boundary = permissions_boundary

    @property
    def tags(self) -> List:
        """Gets the tags of this UpdateRoleDescriptionResponseRole.


        :return: The tags of this UpdateRoleDescriptionResponseRole.
        :rtype: List
        """
        return self._tags

    @tags.setter
    def tags(self, tags: List):
        """Sets the tags of this UpdateRoleDescriptionResponseRole.


        :param tags: The tags of this UpdateRoleDescriptionResponseRole.
        :type tags: List
        """

        self._tags = tags

    @property
    def role_last_used(self) -> RoleRoleLastUsed:
        """Gets the role_last_used of this UpdateRoleDescriptionResponseRole.


        :return: The role_last_used of this UpdateRoleDescriptionResponseRole.
        :rtype: RoleRoleLastUsed
        """
        return self._role_last_used

    @role_last_used.setter
    def role_last_used(self, role_last_used: RoleRoleLastUsed):
        """Sets the role_last_used of this UpdateRoleDescriptionResponseRole.


        :param role_last_used: The role_last_used of this UpdateRoleDescriptionResponseRole.
        :type role_last_used: RoleRoleLastUsed
        """

        self._role_last_used = role_last_used
