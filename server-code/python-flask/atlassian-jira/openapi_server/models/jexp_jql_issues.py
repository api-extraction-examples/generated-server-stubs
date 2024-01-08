from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class JexpJqlIssues(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, max_results=None, query=None, start_at=None, validation='strict'):  # noqa: E501
        """JexpJqlIssues - a model defined in OpenAPI

        :param max_results: The max_results of this JexpJqlIssues.  # noqa: E501
        :type max_results: int
        :param query: The query of this JexpJqlIssues.  # noqa: E501
        :type query: str
        :param start_at: The start_at of this JexpJqlIssues.  # noqa: E501
        :type start_at: int
        :param validation: The validation of this JexpJqlIssues.  # noqa: E501
        :type validation: str
        """
        self.openapi_types = {
            'max_results': int,
            'query': str,
            'start_at': int,
            'validation': str
        }

        self.attribute_map = {
            'max_results': 'maxResults',
            'query': 'query',
            'start_at': 'startAt',
            'validation': 'validation'
        }

        self._max_results = max_results
        self._query = query
        self._start_at = start_at
        self._validation = validation

    @classmethod
    def from_dict(cls, dikt) -> 'JexpJqlIssues':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The JexpJqlIssues of this JexpJqlIssues.  # noqa: E501
        :rtype: JexpJqlIssues
        """
        return util.deserialize_model(dikt, cls)

    @property
    def max_results(self) -> int:
        """Gets the max_results of this JexpJqlIssues.

        The maximum number of issues to return from the JQL query. Inspect `meta.issues.jql.maxResults` in the response to ensure the maximum value has not been exceeded.  # noqa: E501

        :return: The max_results of this JexpJqlIssues.
        :rtype: int
        """
        return self._max_results

    @max_results.setter
    def max_results(self, max_results: int):
        """Sets the max_results of this JexpJqlIssues.

        The maximum number of issues to return from the JQL query. Inspect `meta.issues.jql.maxResults` in the response to ensure the maximum value has not been exceeded.  # noqa: E501

        :param max_results: The max_results of this JexpJqlIssues.
        :type max_results: int
        """

        self._max_results = max_results

    @property
    def query(self) -> str:
        """Gets the query of this JexpJqlIssues.

        The JQL query.  # noqa: E501

        :return: The query of this JexpJqlIssues.
        :rtype: str
        """
        return self._query

    @query.setter
    def query(self, query: str):
        """Sets the query of this JexpJqlIssues.

        The JQL query.  # noqa: E501

        :param query: The query of this JexpJqlIssues.
        :type query: str
        """

        self._query = query

    @property
    def start_at(self) -> int:
        """Gets the start_at of this JexpJqlIssues.

        The index of the first issue to return from the JQL query.  # noqa: E501

        :return: The start_at of this JexpJqlIssues.
        :rtype: int
        """
        return self._start_at

    @start_at.setter
    def start_at(self, start_at: int):
        """Sets the start_at of this JexpJqlIssues.

        The index of the first issue to return from the JQL query.  # noqa: E501

        :param start_at: The start_at of this JexpJqlIssues.
        :type start_at: int
        """

        self._start_at = start_at

    @property
    def validation(self) -> str:
        """Gets the validation of this JexpJqlIssues.

        Determines how to validate the JQL query and treat the validation results.  # noqa: E501

        :return: The validation of this JexpJqlIssues.
        :rtype: str
        """
        return self._validation

    @validation.setter
    def validation(self, validation: str):
        """Sets the validation of this JexpJqlIssues.

        Determines how to validate the JQL query and treat the validation results.  # noqa: E501

        :param validation: The validation of this JexpJqlIssues.
        :type validation: str
        """
        allowed_values = ["strict", "warn", "none"]  # noqa: E501
        if validation not in allowed_values:
            raise ValueError(
                "Invalid value for `validation` ({0}), must be one of {1}"
                .format(validation, allowed_values)
            )

        self._validation = validation