from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.podcasts_featured import PodcastsFeatured
from openapi_server import util

from openapi_server.models.podcasts_featured import PodcastsFeatured  # noqa: E501

class PodcastsFeaturedResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, _schema=None, limit=None, offset=None, results=None, total=None):  # noqa: E501
        """PodcastsFeaturedResponse - a model defined in OpenAPI

        :param _schema: The _schema of this PodcastsFeaturedResponse.  # noqa: E501
        :type _schema: str
        :param limit: The limit of this PodcastsFeaturedResponse.  # noqa: E501
        :type limit: float
        :param offset: The offset of this PodcastsFeaturedResponse.  # noqa: E501
        :type offset: float
        :param results: The results of this PodcastsFeaturedResponse.  # noqa: E501
        :type results: List[PodcastsFeatured]
        :param total: The total of this PodcastsFeaturedResponse.  # noqa: E501
        :type total: float
        """
        self.openapi_types = {
            '_schema': str,
            'limit': float,
            'offset': float,
            'results': List[PodcastsFeatured],
            'total': float
        }

        self.attribute_map = {
            '_schema': '$schema',
            'limit': 'limit',
            'offset': 'offset',
            'results': 'results',
            'total': 'total'
        }

        self.__schema = _schema
        self._limit = limit
        self._offset = offset
        self._results = results
        self._total = total

    @classmethod
    def from_dict(cls, dikt) -> 'PodcastsFeaturedResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PodcastsFeaturedResponse of this PodcastsFeaturedResponse.  # noqa: E501
        :rtype: PodcastsFeaturedResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def _schema(self) -> str:
        """Gets the _schema of this PodcastsFeaturedResponse.


        :return: The _schema of this PodcastsFeaturedResponse.
        :rtype: str
        """
        return self.__schema

    @_schema.setter
    def _schema(self, _schema: str):
        """Sets the _schema of this PodcastsFeaturedResponse.


        :param _schema: The _schema of this PodcastsFeaturedResponse.
        :type _schema: str
        """
        if _schema is None:
            raise ValueError("Invalid value for `_schema`, must not be `None`")  # noqa: E501

        self.__schema = _schema

    @property
    def limit(self) -> float:
        """Gets the limit of this PodcastsFeaturedResponse.


        :return: The limit of this PodcastsFeaturedResponse.
        :rtype: float
        """
        return self._limit

    @limit.setter
    def limit(self, limit: float):
        """Sets the limit of this PodcastsFeaturedResponse.


        :param limit: The limit of this PodcastsFeaturedResponse.
        :type limit: float
        """
        if limit is None:
            raise ValueError("Invalid value for `limit`, must not be `None`")  # noqa: E501

        self._limit = limit

    @property
    def offset(self) -> float:
        """Gets the offset of this PodcastsFeaturedResponse.


        :return: The offset of this PodcastsFeaturedResponse.
        :rtype: float
        """
        return self._offset

    @offset.setter
    def offset(self, offset: float):
        """Sets the offset of this PodcastsFeaturedResponse.


        :param offset: The offset of this PodcastsFeaturedResponse.
        :type offset: float
        """
        if offset is None:
            raise ValueError("Invalid value for `offset`, must not be `None`")  # noqa: E501

        self._offset = offset

    @property
    def results(self) -> List[PodcastsFeatured]:
        """Gets the results of this PodcastsFeaturedResponse.


        :return: The results of this PodcastsFeaturedResponse.
        :rtype: List[PodcastsFeatured]
        """
        return self._results

    @results.setter
    def results(self, results: List[PodcastsFeatured]):
        """Sets the results of this PodcastsFeaturedResponse.


        :param results: The results of this PodcastsFeaturedResponse.
        :type results: List[PodcastsFeatured]
        """
        if results is None:
            raise ValueError("Invalid value for `results`, must not be `None`")  # noqa: E501

        self._results = results

    @property
    def total(self) -> float:
        """Gets the total of this PodcastsFeaturedResponse.


        :return: The total of this PodcastsFeaturedResponse.
        :rtype: float
        """
        return self._total

    @total.setter
    def total(self, total: float):
        """Sets the total of this PodcastsFeaturedResponse.


        :param total: The total of this PodcastsFeaturedResponse.
        :type total: float
        """
        if total is None:
            raise ValueError("Invalid value for `total`, must not be `None`")  # noqa: E501

        self._total = total
