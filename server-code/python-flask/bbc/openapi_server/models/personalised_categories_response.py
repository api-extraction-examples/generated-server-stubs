from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class PersonalisedCategoriesResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, _schema=None, limit=None, offset=None, total=None):  # noqa: E501
        """PersonalisedCategoriesResponse - a model defined in OpenAPI

        :param _schema: The _schema of this PersonalisedCategoriesResponse.  # noqa: E501
        :type _schema: str
        :param limit: The limit of this PersonalisedCategoriesResponse.  # noqa: E501
        :type limit: int
        :param offset: The offset of this PersonalisedCategoriesResponse.  # noqa: E501
        :type offset: int
        :param total: The total of this PersonalisedCategoriesResponse.  # noqa: E501
        :type total: int
        """
        self.openapi_types = {
            '_schema': str,
            'limit': int,
            'offset': int,
            'total': int
        }

        self.attribute_map = {
            '_schema': '$schema',
            'limit': 'limit',
            'offset': 'offset',
            'total': 'total'
        }

        self.__schema = _schema
        self._limit = limit
        self._offset = offset
        self._total = total

    @classmethod
    def from_dict(cls, dikt) -> 'PersonalisedCategoriesResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PersonalisedCategoriesResponse of this PersonalisedCategoriesResponse.  # noqa: E501
        :rtype: PersonalisedCategoriesResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def _schema(self) -> str:
        """Gets the _schema of this PersonalisedCategoriesResponse.


        :return: The _schema of this PersonalisedCategoriesResponse.
        :rtype: str
        """
        return self.__schema

    @_schema.setter
    def _schema(self, _schema: str):
        """Sets the _schema of this PersonalisedCategoriesResponse.


        :param _schema: The _schema of this PersonalisedCategoriesResponse.
        :type _schema: str
        """
        if _schema is None:
            raise ValueError("Invalid value for `_schema`, must not be `None`")  # noqa: E501

        self.__schema = _schema

    @property
    def limit(self) -> int:
        """Gets the limit of this PersonalisedCategoriesResponse.


        :return: The limit of this PersonalisedCategoriesResponse.
        :rtype: int
        """
        return self._limit

    @limit.setter
    def limit(self, limit: int):
        """Sets the limit of this PersonalisedCategoriesResponse.


        :param limit: The limit of this PersonalisedCategoriesResponse.
        :type limit: int
        """
        if limit is None:
            raise ValueError("Invalid value for `limit`, must not be `None`")  # noqa: E501

        self._limit = limit

    @property
    def offset(self) -> int:
        """Gets the offset of this PersonalisedCategoriesResponse.


        :return: The offset of this PersonalisedCategoriesResponse.
        :rtype: int
        """
        return self._offset

    @offset.setter
    def offset(self, offset: int):
        """Sets the offset of this PersonalisedCategoriesResponse.


        :param offset: The offset of this PersonalisedCategoriesResponse.
        :type offset: int
        """
        if offset is None:
            raise ValueError("Invalid value for `offset`, must not be `None`")  # noqa: E501

        self._offset = offset

    @property
    def total(self) -> int:
        """Gets the total of this PersonalisedCategoriesResponse.


        :return: The total of this PersonalisedCategoriesResponse.
        :rtype: int
        """
        return self._total

    @total.setter
    def total(self, total: int):
        """Sets the total of this PersonalisedCategoriesResponse.


        :param total: The total of this PersonalisedCategoriesResponse.
        :type total: int
        """
        if total is None:
            raise ValueError("Invalid value for `total`, must not be `None`")  # noqa: E501

        self._total = total
