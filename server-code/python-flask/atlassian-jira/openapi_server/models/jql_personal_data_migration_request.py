from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class JQLPersonalDataMigrationRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, query_strings=None):  # noqa: E501
        """JQLPersonalDataMigrationRequest - a model defined in OpenAPI

        :param query_strings: The query_strings of this JQLPersonalDataMigrationRequest.  # noqa: E501
        :type query_strings: List[str]
        """
        self.openapi_types = {
            'query_strings': List[str]
        }

        self.attribute_map = {
            'query_strings': 'queryStrings'
        }

        self._query_strings = query_strings

    @classmethod
    def from_dict(cls, dikt) -> 'JQLPersonalDataMigrationRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The JQLPersonalDataMigrationRequest of this JQLPersonalDataMigrationRequest.  # noqa: E501
        :rtype: JQLPersonalDataMigrationRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def query_strings(self) -> List[str]:
        """Gets the query_strings of this JQLPersonalDataMigrationRequest.

        A list of queries with user identifiers. Maximum of 100 queries.  # noqa: E501

        :return: The query_strings of this JQLPersonalDataMigrationRequest.
        :rtype: List[str]
        """
        return self._query_strings

    @query_strings.setter
    def query_strings(self, query_strings: List[str]):
        """Sets the query_strings of this JQLPersonalDataMigrationRequest.

        A list of queries with user identifiers. Maximum of 100 queries.  # noqa: E501

        :param query_strings: The query_strings of this JQLPersonalDataMigrationRequest.
        :type query_strings: List[str]
        """

        self._query_strings = query_strings