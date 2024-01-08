from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ContextForProjectAndIssueType(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, context_id=None, issue_type_id=None, project_id=None):  # noqa: E501
        """ContextForProjectAndIssueType - a model defined in OpenAPI

        :param context_id: The context_id of this ContextForProjectAndIssueType.  # noqa: E501
        :type context_id: str
        :param issue_type_id: The issue_type_id of this ContextForProjectAndIssueType.  # noqa: E501
        :type issue_type_id: str
        :param project_id: The project_id of this ContextForProjectAndIssueType.  # noqa: E501
        :type project_id: str
        """
        self.openapi_types = {
            'context_id': str,
            'issue_type_id': str,
            'project_id': str
        }

        self.attribute_map = {
            'context_id': 'contextId',
            'issue_type_id': 'issueTypeId',
            'project_id': 'projectId'
        }

        self._context_id = context_id
        self._issue_type_id = issue_type_id
        self._project_id = project_id

    @classmethod
    def from_dict(cls, dikt) -> 'ContextForProjectAndIssueType':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ContextForProjectAndIssueType of this ContextForProjectAndIssueType.  # noqa: E501
        :rtype: ContextForProjectAndIssueType
        """
        return util.deserialize_model(dikt, cls)

    @property
    def context_id(self) -> str:
        """Gets the context_id of this ContextForProjectAndIssueType.

        The ID of the custom field context.  # noqa: E501

        :return: The context_id of this ContextForProjectAndIssueType.
        :rtype: str
        """
        return self._context_id

    @context_id.setter
    def context_id(self, context_id: str):
        """Sets the context_id of this ContextForProjectAndIssueType.

        The ID of the custom field context.  # noqa: E501

        :param context_id: The context_id of this ContextForProjectAndIssueType.
        :type context_id: str
        """
        if context_id is None:
            raise ValueError("Invalid value for `context_id`, must not be `None`")  # noqa: E501

        self._context_id = context_id

    @property
    def issue_type_id(self) -> str:
        """Gets the issue_type_id of this ContextForProjectAndIssueType.

        The ID of the issue type.  # noqa: E501

        :return: The issue_type_id of this ContextForProjectAndIssueType.
        :rtype: str
        """
        return self._issue_type_id

    @issue_type_id.setter
    def issue_type_id(self, issue_type_id: str):
        """Sets the issue_type_id of this ContextForProjectAndIssueType.

        The ID of the issue type.  # noqa: E501

        :param issue_type_id: The issue_type_id of this ContextForProjectAndIssueType.
        :type issue_type_id: str
        """
        if issue_type_id is None:
            raise ValueError("Invalid value for `issue_type_id`, must not be `None`")  # noqa: E501

        self._issue_type_id = issue_type_id

    @property
    def project_id(self) -> str:
        """Gets the project_id of this ContextForProjectAndIssueType.

        The ID of the project.  # noqa: E501

        :return: The project_id of this ContextForProjectAndIssueType.
        :rtype: str
        """
        return self._project_id

    @project_id.setter
    def project_id(self, project_id: str):
        """Sets the project_id of this ContextForProjectAndIssueType.

        The ID of the project.  # noqa: E501

        :param project_id: The project_id of this ContextForProjectAndIssueType.
        :type project_id: str
        """
        if project_id is None:
            raise ValueError("Invalid value for `project_id`, must not be `None`")  # noqa: E501

        self._project_id = project_id