from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.music_export_preferences import MusicExportPreferences
from openapi_server import util

from openapi_server.models.music_export_preferences import MusicExportPreferences  # noqa: E501

class MusicExportPreferencesResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, method=None, replied_at=None, results=None, _schema=None, total=None):  # noqa: E501
        """MusicExportPreferencesResponse - a model defined in OpenAPI

        :param method: The method of this MusicExportPreferencesResponse.  # noqa: E501
        :type method: str
        :param replied_at: The replied_at of this MusicExportPreferencesResponse.  # noqa: E501
        :type replied_at: str
        :param results: The results of this MusicExportPreferencesResponse.  # noqa: E501
        :type results: List[MusicExportPreferences]
        :param _schema: The _schema of this MusicExportPreferencesResponse.  # noqa: E501
        :type _schema: str
        :param total: The total of this MusicExportPreferencesResponse.  # noqa: E501
        :type total: int
        """
        self.openapi_types = {
            'method': str,
            'replied_at': str,
            'results': List[MusicExportPreferences],
            '_schema': str,
            'total': int
        }

        self.attribute_map = {
            'method': 'method',
            'replied_at': 'replied_at',
            'results': 'results',
            '_schema': 'schema',
            'total': 'total'
        }

        self._method = method
        self._replied_at = replied_at
        self._results = results
        self.__schema = _schema
        self._total = total

    @classmethod
    def from_dict(cls, dikt) -> 'MusicExportPreferencesResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The MusicExportPreferencesResponse of this MusicExportPreferencesResponse.  # noqa: E501
        :rtype: MusicExportPreferencesResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def method(self) -> str:
        """Gets the method of this MusicExportPreferencesResponse.


        :return: The method of this MusicExportPreferencesResponse.
        :rtype: str
        """
        return self._method

    @method.setter
    def method(self, method: str):
        """Sets the method of this MusicExportPreferencesResponse.


        :param method: The method of this MusicExportPreferencesResponse.
        :type method: str
        """
        if method is None:
            raise ValueError("Invalid value for `method`, must not be `None`")  # noqa: E501

        self._method = method

    @property
    def replied_at(self) -> str:
        """Gets the replied_at of this MusicExportPreferencesResponse.


        :return: The replied_at of this MusicExportPreferencesResponse.
        :rtype: str
        """
        return self._replied_at

    @replied_at.setter
    def replied_at(self, replied_at: str):
        """Sets the replied_at of this MusicExportPreferencesResponse.


        :param replied_at: The replied_at of this MusicExportPreferencesResponse.
        :type replied_at: str
        """
        if replied_at is None:
            raise ValueError("Invalid value for `replied_at`, must not be `None`")  # noqa: E501

        self._replied_at = replied_at

    @property
    def results(self) -> List[MusicExportPreferences]:
        """Gets the results of this MusicExportPreferencesResponse.


        :return: The results of this MusicExportPreferencesResponse.
        :rtype: List[MusicExportPreferences]
        """
        return self._results

    @results.setter
    def results(self, results: List[MusicExportPreferences]):
        """Sets the results of this MusicExportPreferencesResponse.


        :param results: The results of this MusicExportPreferencesResponse.
        :type results: List[MusicExportPreferences]
        """
        if results is None:
            raise ValueError("Invalid value for `results`, must not be `None`")  # noqa: E501

        self._results = results

    @property
    def _schema(self) -> str:
        """Gets the _schema of this MusicExportPreferencesResponse.


        :return: The _schema of this MusicExportPreferencesResponse.
        :rtype: str
        """
        return self.__schema

    @_schema.setter
    def _schema(self, _schema: str):
        """Sets the _schema of this MusicExportPreferencesResponse.


        :param _schema: The _schema of this MusicExportPreferencesResponse.
        :type _schema: str
        """
        if _schema is None:
            raise ValueError("Invalid value for `_schema`, must not be `None`")  # noqa: E501

        self.__schema = _schema

    @property
    def total(self) -> int:
        """Gets the total of this MusicExportPreferencesResponse.


        :return: The total of this MusicExportPreferencesResponse.
        :rtype: int
        """
        return self._total

    @total.setter
    def total(self, total: int):
        """Sets the total of this MusicExportPreferencesResponse.


        :param total: The total of this MusicExportPreferencesResponse.
        :type total: int
        """
        if total is None:
            raise ValueError("Invalid value for `total`, must not be `None`")  # noqa: E501

        self._total = total
