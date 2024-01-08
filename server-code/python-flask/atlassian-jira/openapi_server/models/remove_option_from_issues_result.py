from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.simple_error_collection import SimpleErrorCollection
from openapi_server import util

from openapi_server.models.simple_error_collection import SimpleErrorCollection  # noqa: E501

class RemoveOptionFromIssuesResult(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, errors=None, modified_issues=None, unmodified_issues=None):  # noqa: E501
        """RemoveOptionFromIssuesResult - a model defined in OpenAPI

        :param errors: The errors of this RemoveOptionFromIssuesResult.  # noqa: E501
        :type errors: SimpleErrorCollection
        :param modified_issues: The modified_issues of this RemoveOptionFromIssuesResult.  # noqa: E501
        :type modified_issues: List[int]
        :param unmodified_issues: The unmodified_issues of this RemoveOptionFromIssuesResult.  # noqa: E501
        :type unmodified_issues: List[int]
        """
        self.openapi_types = {
            'errors': SimpleErrorCollection,
            'modified_issues': List[int],
            'unmodified_issues': List[int]
        }

        self.attribute_map = {
            'errors': 'errors',
            'modified_issues': 'modifiedIssues',
            'unmodified_issues': 'unmodifiedIssues'
        }

        self._errors = errors
        self._modified_issues = modified_issues
        self._unmodified_issues = unmodified_issues

    @classmethod
    def from_dict(cls, dikt) -> 'RemoveOptionFromIssuesResult':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The RemoveOptionFromIssuesResult of this RemoveOptionFromIssuesResult.  # noqa: E501
        :rtype: RemoveOptionFromIssuesResult
        """
        return util.deserialize_model(dikt, cls)

    @property
    def errors(self) -> SimpleErrorCollection:
        """Gets the errors of this RemoveOptionFromIssuesResult.


        :return: The errors of this RemoveOptionFromIssuesResult.
        :rtype: SimpleErrorCollection
        """
        return self._errors

    @errors.setter
    def errors(self, errors: SimpleErrorCollection):
        """Sets the errors of this RemoveOptionFromIssuesResult.


        :param errors: The errors of this RemoveOptionFromIssuesResult.
        :type errors: SimpleErrorCollection
        """

        self._errors = errors

    @property
    def modified_issues(self) -> List[int]:
        """Gets the modified_issues of this RemoveOptionFromIssuesResult.

        The IDs of the modified issues.  # noqa: E501

        :return: The modified_issues of this RemoveOptionFromIssuesResult.
        :rtype: List[int]
        """
        return self._modified_issues

    @modified_issues.setter
    def modified_issues(self, modified_issues: List[int]):
        """Sets the modified_issues of this RemoveOptionFromIssuesResult.

        The IDs of the modified issues.  # noqa: E501

        :param modified_issues: The modified_issues of this RemoveOptionFromIssuesResult.
        :type modified_issues: List[int]
        """

        self._modified_issues = modified_issues

    @property
    def unmodified_issues(self) -> List[int]:
        """Gets the unmodified_issues of this RemoveOptionFromIssuesResult.

        The IDs of the unchanged issues, those issues where errors prevent modification.  # noqa: E501

        :return: The unmodified_issues of this RemoveOptionFromIssuesResult.
        :rtype: List[int]
        """
        return self._unmodified_issues

    @unmodified_issues.setter
    def unmodified_issues(self, unmodified_issues: List[int]):
        """Sets the unmodified_issues of this RemoveOptionFromIssuesResult.

        The IDs of the unchanged issues, those issues where errors prevent modification.  # noqa: E501

        :param unmodified_issues: The unmodified_issues of this RemoveOptionFromIssuesResult.
        :type unmodified_issues: List[int]
        """

        self._unmodified_issues = unmodified_issues