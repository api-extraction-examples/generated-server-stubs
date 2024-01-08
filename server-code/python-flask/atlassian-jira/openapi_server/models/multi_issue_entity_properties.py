from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.issue_entity_properties_for_multi_update import IssueEntityPropertiesForMultiUpdate
from openapi_server import util

from openapi_server.models.issue_entity_properties_for_multi_update import IssueEntityPropertiesForMultiUpdate  # noqa: E501

class MultiIssueEntityProperties(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, issues=None):  # noqa: E501
        """MultiIssueEntityProperties - a model defined in OpenAPI

        :param issues: The issues of this MultiIssueEntityProperties.  # noqa: E501
        :type issues: List[IssueEntityPropertiesForMultiUpdate]
        """
        self.openapi_types = {
            'issues': List[IssueEntityPropertiesForMultiUpdate]
        }

        self.attribute_map = {
            'issues': 'issues'
        }

        self._issues = issues

    @classmethod
    def from_dict(cls, dikt) -> 'MultiIssueEntityProperties':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The MultiIssueEntityProperties of this MultiIssueEntityProperties.  # noqa: E501
        :rtype: MultiIssueEntityProperties
        """
        return util.deserialize_model(dikt, cls)

    @property
    def issues(self) -> List[IssueEntityPropertiesForMultiUpdate]:
        """Gets the issues of this MultiIssueEntityProperties.

        A list of issue IDs and their respective properties.  # noqa: E501

        :return: The issues of this MultiIssueEntityProperties.
        :rtype: List[IssueEntityPropertiesForMultiUpdate]
        """
        return self._issues

    @issues.setter
    def issues(self, issues: List[IssueEntityPropertiesForMultiUpdate]):
        """Sets the issues of this MultiIssueEntityProperties.

        A list of issue IDs and their respective properties.  # noqa: E501

        :param issues: The issues of this MultiIssueEntityProperties.
        :type issues: List[IssueEntityPropertiesForMultiUpdate]
        """

        self._issues = issues
