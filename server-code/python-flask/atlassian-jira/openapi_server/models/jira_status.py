from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.project_issue_types import ProjectIssueTypes
from openapi_server.models.status_scope import StatusScope
from openapi_server import util

from openapi_server.models.project_issue_types import ProjectIssueTypes  # noqa: E501
from openapi_server.models.status_scope import StatusScope  # noqa: E501

class JiraStatus(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, description=None, id=None, name=None, scope=None, status_category=None, usages=None):  # noqa: E501
        """JiraStatus - a model defined in OpenAPI

        :param description: The description of this JiraStatus.  # noqa: E501
        :type description: str
        :param id: The id of this JiraStatus.  # noqa: E501
        :type id: str
        :param name: The name of this JiraStatus.  # noqa: E501
        :type name: str
        :param scope: The scope of this JiraStatus.  # noqa: E501
        :type scope: StatusScope
        :param status_category: The status_category of this JiraStatus.  # noqa: E501
        :type status_category: str
        :param usages: The usages of this JiraStatus.  # noqa: E501
        :type usages: list[ProjectIssueTypes]
        """
        self.openapi_types = {
            'description': str,
            'id': str,
            'name': str,
            'scope': StatusScope,
            'status_category': str,
            'usages': list[ProjectIssueTypes]
        }

        self.attribute_map = {
            'description': 'description',
            'id': 'id',
            'name': 'name',
            'scope': 'scope',
            'status_category': 'statusCategory',
            'usages': 'usages'
        }

        self._description = description
        self._id = id
        self._name = name
        self._scope = scope
        self._status_category = status_category
        self._usages = usages

    @classmethod
    def from_dict(cls, dikt) -> 'JiraStatus':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The JiraStatus of this JiraStatus.  # noqa: E501
        :rtype: JiraStatus
        """
        return util.deserialize_model(dikt, cls)

    @property
    def description(self) -> str:
        """Gets the description of this JiraStatus.

        The description of the status.  # noqa: E501

        :return: The description of this JiraStatus.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this JiraStatus.

        The description of the status.  # noqa: E501

        :param description: The description of this JiraStatus.
        :type description: str
        """

        self._description = description

    @property
    def id(self) -> str:
        """Gets the id of this JiraStatus.

        The ID of the status.  # noqa: E501

        :return: The id of this JiraStatus.
        :rtype: str
        """
        return self._id

    @id.setter
    def id(self, id: str):
        """Sets the id of this JiraStatus.

        The ID of the status.  # noqa: E501

        :param id: The id of this JiraStatus.
        :type id: str
        """

        self._id = id

    @property
    def name(self) -> str:
        """Gets the name of this JiraStatus.

        The name of the status.  # noqa: E501

        :return: The name of this JiraStatus.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this JiraStatus.

        The name of the status.  # noqa: E501

        :param name: The name of this JiraStatus.
        :type name: str
        """

        self._name = name

    @property
    def scope(self) -> StatusScope:
        """Gets the scope of this JiraStatus.


        :return: The scope of this JiraStatus.
        :rtype: StatusScope
        """
        return self._scope

    @scope.setter
    def scope(self, scope: StatusScope):
        """Sets the scope of this JiraStatus.


        :param scope: The scope of this JiraStatus.
        :type scope: StatusScope
        """

        self._scope = scope

    @property
    def status_category(self) -> str:
        """Gets the status_category of this JiraStatus.

        The category of the status.  # noqa: E501

        :return: The status_category of this JiraStatus.
        :rtype: str
        """
        return self._status_category

    @status_category.setter
    def status_category(self, status_category: str):
        """Sets the status_category of this JiraStatus.

        The category of the status.  # noqa: E501

        :param status_category: The status_category of this JiraStatus.
        :type status_category: str
        """
        allowed_values = ["TODO", "IN_PROGRESS", "DONE"]  # noqa: E501
        if status_category not in allowed_values:
            raise ValueError(
                "Invalid value for `status_category` ({0}), must be one of {1}"
                .format(status_category, allowed_values)
            )

        self._status_category = status_category

    @property
    def usages(self) -> list[ProjectIssueTypes]:
        """Gets the usages of this JiraStatus.

        Projects and issue types where the status is used. Only available if the `usages` expand is requested.  # noqa: E501

        :return: The usages of this JiraStatus.
        :rtype: list[ProjectIssueTypes]
        """
        return self._usages

    @usages.setter
    def usages(self, usages: list[ProjectIssueTypes]):
        """Sets the usages of this JiraStatus.

        Projects and issue types where the status is used. Only available if the `usages` expand is requested.  # noqa: E501

        :param usages: The usages of this JiraStatus.
        :type usages: list[ProjectIssueTypes]
        """

        self._usages = usages
