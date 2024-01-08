from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class UpdateProjectDetails(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, assignee_type=None, avatar_id=None, category_id=None, description=None, issue_security_scheme=None, key=None, lead=None, lead_account_id=None, name=None, notification_scheme=None, permission_scheme=None, url=None):  # noqa: E501
        """UpdateProjectDetails - a model defined in OpenAPI

        :param assignee_type: The assignee_type of this UpdateProjectDetails.  # noqa: E501
        :type assignee_type: str
        :param avatar_id: The avatar_id of this UpdateProjectDetails.  # noqa: E501
        :type avatar_id: int
        :param category_id: The category_id of this UpdateProjectDetails.  # noqa: E501
        :type category_id: int
        :param description: The description of this UpdateProjectDetails.  # noqa: E501
        :type description: str
        :param issue_security_scheme: The issue_security_scheme of this UpdateProjectDetails.  # noqa: E501
        :type issue_security_scheme: int
        :param key: The key of this UpdateProjectDetails.  # noqa: E501
        :type key: str
        :param lead: The lead of this UpdateProjectDetails.  # noqa: E501
        :type lead: str
        :param lead_account_id: The lead_account_id of this UpdateProjectDetails.  # noqa: E501
        :type lead_account_id: str
        :param name: The name of this UpdateProjectDetails.  # noqa: E501
        :type name: str
        :param notification_scheme: The notification_scheme of this UpdateProjectDetails.  # noqa: E501
        :type notification_scheme: int
        :param permission_scheme: The permission_scheme of this UpdateProjectDetails.  # noqa: E501
        :type permission_scheme: int
        :param url: The url of this UpdateProjectDetails.  # noqa: E501
        :type url: str
        """
        self.openapi_types = {
            'assignee_type': str,
            'avatar_id': int,
            'category_id': int,
            'description': str,
            'issue_security_scheme': int,
            'key': str,
            'lead': str,
            'lead_account_id': str,
            'name': str,
            'notification_scheme': int,
            'permission_scheme': int,
            'url': str
        }

        self.attribute_map = {
            'assignee_type': 'assigneeType',
            'avatar_id': 'avatarId',
            'category_id': 'categoryId',
            'description': 'description',
            'issue_security_scheme': 'issueSecurityScheme',
            'key': 'key',
            'lead': 'lead',
            'lead_account_id': 'leadAccountId',
            'name': 'name',
            'notification_scheme': 'notificationScheme',
            'permission_scheme': 'permissionScheme',
            'url': 'url'
        }

        self._assignee_type = assignee_type
        self._avatar_id = avatar_id
        self._category_id = category_id
        self._description = description
        self._issue_security_scheme = issue_security_scheme
        self._key = key
        self._lead = lead
        self._lead_account_id = lead_account_id
        self._name = name
        self._notification_scheme = notification_scheme
        self._permission_scheme = permission_scheme
        self._url = url

    @classmethod
    def from_dict(cls, dikt) -> 'UpdateProjectDetails':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The UpdateProjectDetails of this UpdateProjectDetails.  # noqa: E501
        :rtype: UpdateProjectDetails
        """
        return util.deserialize_model(dikt, cls)

    @property
    def assignee_type(self) -> str:
        """Gets the assignee_type of this UpdateProjectDetails.

        The default assignee when creating issues for this project.  # noqa: E501

        :return: The assignee_type of this UpdateProjectDetails.
        :rtype: str
        """
        return self._assignee_type

    @assignee_type.setter
    def assignee_type(self, assignee_type: str):
        """Sets the assignee_type of this UpdateProjectDetails.

        The default assignee when creating issues for this project.  # noqa: E501

        :param assignee_type: The assignee_type of this UpdateProjectDetails.
        :type assignee_type: str
        """
        allowed_values = ["PROJECT_LEAD", "UNASSIGNED"]  # noqa: E501
        if assignee_type not in allowed_values:
            raise ValueError(
                "Invalid value for `assignee_type` ({0}), must be one of {1}"
                .format(assignee_type, allowed_values)
            )

        self._assignee_type = assignee_type

    @property
    def avatar_id(self) -> int:
        """Gets the avatar_id of this UpdateProjectDetails.

        An integer value for the project's avatar.  # noqa: E501

        :return: The avatar_id of this UpdateProjectDetails.
        :rtype: int
        """
        return self._avatar_id

    @avatar_id.setter
    def avatar_id(self, avatar_id: int):
        """Sets the avatar_id of this UpdateProjectDetails.

        An integer value for the project's avatar.  # noqa: E501

        :param avatar_id: The avatar_id of this UpdateProjectDetails.
        :type avatar_id: int
        """

        self._avatar_id = avatar_id

    @property
    def category_id(self) -> int:
        """Gets the category_id of this UpdateProjectDetails.

        The ID of the project's category. A complete list of category IDs is found using the [Get all project categories](#api-rest-api-3-projectCategory-get) operation. To remove the project category from the project, set the value to `-1.`  # noqa: E501

        :return: The category_id of this UpdateProjectDetails.
        :rtype: int
        """
        return self._category_id

    @category_id.setter
    def category_id(self, category_id: int):
        """Sets the category_id of this UpdateProjectDetails.

        The ID of the project's category. A complete list of category IDs is found using the [Get all project categories](#api-rest-api-3-projectCategory-get) operation. To remove the project category from the project, set the value to `-1.`  # noqa: E501

        :param category_id: The category_id of this UpdateProjectDetails.
        :type category_id: int
        """

        self._category_id = category_id

    @property
    def description(self) -> str:
        """Gets the description of this UpdateProjectDetails.

        A brief description of the project.  # noqa: E501

        :return: The description of this UpdateProjectDetails.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this UpdateProjectDetails.

        A brief description of the project.  # noqa: E501

        :param description: The description of this UpdateProjectDetails.
        :type description: str
        """

        self._description = description

    @property
    def issue_security_scheme(self) -> int:
        """Gets the issue_security_scheme of this UpdateProjectDetails.

        The ID of the issue security scheme for the project, which enables you to control who can and cannot view issues. Use the [Get issue security schemes](#api-rest-api-3-issuesecurityschemes-get) resource to get all issue security scheme IDs.  # noqa: E501

        :return: The issue_security_scheme of this UpdateProjectDetails.
        :rtype: int
        """
        return self._issue_security_scheme

    @issue_security_scheme.setter
    def issue_security_scheme(self, issue_security_scheme: int):
        """Sets the issue_security_scheme of this UpdateProjectDetails.

        The ID of the issue security scheme for the project, which enables you to control who can and cannot view issues. Use the [Get issue security schemes](#api-rest-api-3-issuesecurityschemes-get) resource to get all issue security scheme IDs.  # noqa: E501

        :param issue_security_scheme: The issue_security_scheme of this UpdateProjectDetails.
        :type issue_security_scheme: int
        """

        self._issue_security_scheme = issue_security_scheme

    @property
    def key(self) -> str:
        """Gets the key of this UpdateProjectDetails.

        Project keys must be unique and start with an uppercase letter followed by one or more uppercase alphanumeric characters. The maximum length is 10 characters.  # noqa: E501

        :return: The key of this UpdateProjectDetails.
        :rtype: str
        """
        return self._key

    @key.setter
    def key(self, key: str):
        """Sets the key of this UpdateProjectDetails.

        Project keys must be unique and start with an uppercase letter followed by one or more uppercase alphanumeric characters. The maximum length is 10 characters.  # noqa: E501

        :param key: The key of this UpdateProjectDetails.
        :type key: str
        """

        self._key = key

    @property
    def lead(self) -> str:
        """Gets the lead of this UpdateProjectDetails.

        This parameter is deprecated because of privacy changes. Use `leadAccountId` instead. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. The user name of the project lead. Cannot be provided with `leadAccountId`.  # noqa: E501

        :return: The lead of this UpdateProjectDetails.
        :rtype: str
        """
        return self._lead

    @lead.setter
    def lead(self, lead: str):
        """Sets the lead of this UpdateProjectDetails.

        This parameter is deprecated because of privacy changes. Use `leadAccountId` instead. See the [migration guide](https://developer.atlassian.com/cloud/jira/platform/deprecation-notice-user-privacy-api-migration-guide/) for details. The user name of the project lead. Cannot be provided with `leadAccountId`.  # noqa: E501

        :param lead: The lead of this UpdateProjectDetails.
        :type lead: str
        """

        self._lead = lead

    @property
    def lead_account_id(self) -> str:
        """Gets the lead_account_id of this UpdateProjectDetails.

        The account ID of the project lead. Cannot be provided with `lead`.  # noqa: E501

        :return: The lead_account_id of this UpdateProjectDetails.
        :rtype: str
        """
        return self._lead_account_id

    @lead_account_id.setter
    def lead_account_id(self, lead_account_id: str):
        """Sets the lead_account_id of this UpdateProjectDetails.

        The account ID of the project lead. Cannot be provided with `lead`.  # noqa: E501

        :param lead_account_id: The lead_account_id of this UpdateProjectDetails.
        :type lead_account_id: str
        """
        if lead_account_id is not None and len(lead_account_id) > 128:
            raise ValueError("Invalid value for `lead_account_id`, length must be less than or equal to `128`")  # noqa: E501

        self._lead_account_id = lead_account_id

    @property
    def name(self) -> str:
        """Gets the name of this UpdateProjectDetails.

        The name of the project.  # noqa: E501

        :return: The name of this UpdateProjectDetails.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this UpdateProjectDetails.

        The name of the project.  # noqa: E501

        :param name: The name of this UpdateProjectDetails.
        :type name: str
        """

        self._name = name

    @property
    def notification_scheme(self) -> int:
        """Gets the notification_scheme of this UpdateProjectDetails.

        The ID of the notification scheme for the project. Use the [Get notification schemes](#api-rest-api-3-notificationscheme-get) resource to get a list of notification scheme IDs.  # noqa: E501

        :return: The notification_scheme of this UpdateProjectDetails.
        :rtype: int
        """
        return self._notification_scheme

    @notification_scheme.setter
    def notification_scheme(self, notification_scheme: int):
        """Sets the notification_scheme of this UpdateProjectDetails.

        The ID of the notification scheme for the project. Use the [Get notification schemes](#api-rest-api-3-notificationscheme-get) resource to get a list of notification scheme IDs.  # noqa: E501

        :param notification_scheme: The notification_scheme of this UpdateProjectDetails.
        :type notification_scheme: int
        """

        self._notification_scheme = notification_scheme

    @property
    def permission_scheme(self) -> int:
        """Gets the permission_scheme of this UpdateProjectDetails.

        The ID of the permission scheme for the project. Use the [Get all permission schemes](#api-rest-api-3-permissionscheme-get) resource to see a list of all permission scheme IDs.  # noqa: E501

        :return: The permission_scheme of this UpdateProjectDetails.
        :rtype: int
        """
        return self._permission_scheme

    @permission_scheme.setter
    def permission_scheme(self, permission_scheme: int):
        """Sets the permission_scheme of this UpdateProjectDetails.

        The ID of the permission scheme for the project. Use the [Get all permission schemes](#api-rest-api-3-permissionscheme-get) resource to see a list of all permission scheme IDs.  # noqa: E501

        :param permission_scheme: The permission_scheme of this UpdateProjectDetails.
        :type permission_scheme: int
        """

        self._permission_scheme = permission_scheme

    @property
    def url(self) -> str:
        """Gets the url of this UpdateProjectDetails.

        A link to information about this project, such as project documentation  # noqa: E501

        :return: The url of this UpdateProjectDetails.
        :rtype: str
        """
        return self._url

    @url.setter
    def url(self, url: str):
        """Sets the url of this UpdateProjectDetails.

        A link to information about this project, such as project documentation  # noqa: E501

        :param url: The url of this UpdateProjectDetails.
        :type url: str
        """

        self._url = url
