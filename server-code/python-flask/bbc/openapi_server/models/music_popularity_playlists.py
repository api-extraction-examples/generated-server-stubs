from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.music_popularity_playlist import MusicPopularityPlaylist
from openapi_server import util

from openapi_server.models.music_popularity_playlist import MusicPopularityPlaylist  # noqa: E501

class MusicPopularityPlaylists(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, limit=None, method=None, offset=None, replied_at=None, results=None, _schema=None, total=None):  # noqa: E501
        """MusicPopularityPlaylists - a model defined in OpenAPI

        :param limit: The limit of this MusicPopularityPlaylists.  # noqa: E501
        :type limit: int
        :param method: The method of this MusicPopularityPlaylists.  # noqa: E501
        :type method: str
        :param offset: The offset of this MusicPopularityPlaylists.  # noqa: E501
        :type offset: int
        :param replied_at: The replied_at of this MusicPopularityPlaylists.  # noqa: E501
        :type replied_at: str
        :param results: The results of this MusicPopularityPlaylists.  # noqa: E501
        :type results: List[MusicPopularityPlaylist]
        :param _schema: The _schema of this MusicPopularityPlaylists.  # noqa: E501
        :type _schema: str
        :param total: The total of this MusicPopularityPlaylists.  # noqa: E501
        :type total: int
        """
        self.openapi_types = {
            'limit': int,
            'method': str,
            'offset': int,
            'replied_at': str,
            'results': List[MusicPopularityPlaylist],
            '_schema': str,
            'total': int
        }

        self.attribute_map = {
            'limit': 'limit',
            'method': 'method',
            'offset': 'offset',
            'replied_at': 'repliedAt',
            'results': 'results',
            '_schema': 'schema',
            'total': 'total'
        }

        self._limit = limit
        self._method = method
        self._offset = offset
        self._replied_at = replied_at
        self._results = results
        self.__schema = _schema
        self._total = total

    @classmethod
    def from_dict(cls, dikt) -> 'MusicPopularityPlaylists':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The MusicPopularityPlaylists of this MusicPopularityPlaylists.  # noqa: E501
        :rtype: MusicPopularityPlaylists
        """
        return util.deserialize_model(dikt, cls)

    @property
    def limit(self) -> int:
        """Gets the limit of this MusicPopularityPlaylists.


        :return: The limit of this MusicPopularityPlaylists.
        :rtype: int
        """
        return self._limit

    @limit.setter
    def limit(self, limit: int):
        """Sets the limit of this MusicPopularityPlaylists.


        :param limit: The limit of this MusicPopularityPlaylists.
        :type limit: int
        """

        self._limit = limit

    @property
    def method(self) -> str:
        """Gets the method of this MusicPopularityPlaylists.


        :return: The method of this MusicPopularityPlaylists.
        :rtype: str
        """
        return self._method

    @method.setter
    def method(self, method: str):
        """Sets the method of this MusicPopularityPlaylists.


        :param method: The method of this MusicPopularityPlaylists.
        :type method: str
        """
        if method is None:
            raise ValueError("Invalid value for `method`, must not be `None`")  # noqa: E501

        self._method = method

    @property
    def offset(self) -> int:
        """Gets the offset of this MusicPopularityPlaylists.


        :return: The offset of this MusicPopularityPlaylists.
        :rtype: int
        """
        return self._offset

    @offset.setter
    def offset(self, offset: int):
        """Sets the offset of this MusicPopularityPlaylists.


        :param offset: The offset of this MusicPopularityPlaylists.
        :type offset: int
        """

        self._offset = offset

    @property
    def replied_at(self) -> str:
        """Gets the replied_at of this MusicPopularityPlaylists.


        :return: The replied_at of this MusicPopularityPlaylists.
        :rtype: str
        """
        return self._replied_at

    @replied_at.setter
    def replied_at(self, replied_at: str):
        """Sets the replied_at of this MusicPopularityPlaylists.


        :param replied_at: The replied_at of this MusicPopularityPlaylists.
        :type replied_at: str
        """
        if replied_at is None:
            raise ValueError("Invalid value for `replied_at`, must not be `None`")  # noqa: E501

        self._replied_at = replied_at

    @property
    def results(self) -> List[MusicPopularityPlaylist]:
        """Gets the results of this MusicPopularityPlaylists.


        :return: The results of this MusicPopularityPlaylists.
        :rtype: List[MusicPopularityPlaylist]
        """
        return self._results

    @results.setter
    def results(self, results: List[MusicPopularityPlaylist]):
        """Sets the results of this MusicPopularityPlaylists.


        :param results: The results of this MusicPopularityPlaylists.
        :type results: List[MusicPopularityPlaylist]
        """
        if results is None:
            raise ValueError("Invalid value for `results`, must not be `None`")  # noqa: E501

        self._results = results

    @property
    def _schema(self) -> str:
        """Gets the _schema of this MusicPopularityPlaylists.


        :return: The _schema of this MusicPopularityPlaylists.
        :rtype: str
        """
        return self.__schema

    @_schema.setter
    def _schema(self, _schema: str):
        """Sets the _schema of this MusicPopularityPlaylists.


        :param _schema: The _schema of this MusicPopularityPlaylists.
        :type _schema: str
        """
        if _schema is None:
            raise ValueError("Invalid value for `_schema`, must not be `None`")  # noqa: E501

        self.__schema = _schema

    @property
    def total(self) -> int:
        """Gets the total of this MusicPopularityPlaylists.


        :return: The total of this MusicPopularityPlaylists.
        :rtype: int
        """
        return self._total

    @total.setter
    def total(self, total: int):
        """Sets the total of this MusicPopularityPlaylists.


        :param total: The total of this MusicPopularityPlaylists.
        :type total: int
        """
        if total is None:
            raise ValueError("Invalid value for `total`, must not be `None`")  # noqa: E501

        self._total = total