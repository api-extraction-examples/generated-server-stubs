from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ListServerCertificatesRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, path_prefix=None, marker=None, max_items=None):  # noqa: E501
        """ListServerCertificatesRequest - a model defined in OpenAPI

        :param path_prefix: The path_prefix of this ListServerCertificatesRequest.  # noqa: E501
        :type path_prefix: str
        :param marker: The marker of this ListServerCertificatesRequest.  # noqa: E501
        :type marker: str
        :param max_items: The max_items of this ListServerCertificatesRequest.  # noqa: E501
        :type max_items: int
        """
        self.openapi_types = {
            'path_prefix': str,
            'marker': str,
            'max_items': int
        }

        self.attribute_map = {
            'path_prefix': 'PathPrefix',
            'marker': 'Marker',
            'max_items': 'MaxItems'
        }

        self._path_prefix = path_prefix
        self._marker = marker
        self._max_items = max_items

    @classmethod
    def from_dict(cls, dikt) -> 'ListServerCertificatesRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ListServerCertificatesRequest of this ListServerCertificatesRequest.  # noqa: E501
        :rtype: ListServerCertificatesRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def path_prefix(self) -> str:
        """Gets the path_prefix of this ListServerCertificatesRequest.


        :return: The path_prefix of this ListServerCertificatesRequest.
        :rtype: str
        """
        return self._path_prefix

    @path_prefix.setter
    def path_prefix(self, path_prefix: str):
        """Sets the path_prefix of this ListServerCertificatesRequest.


        :param path_prefix: The path_prefix of this ListServerCertificatesRequest.
        :type path_prefix: str
        """

        self._path_prefix = path_prefix

    @property
    def marker(self) -> str:
        """Gets the marker of this ListServerCertificatesRequest.


        :return: The marker of this ListServerCertificatesRequest.
        :rtype: str
        """
        return self._marker

    @marker.setter
    def marker(self, marker: str):
        """Sets the marker of this ListServerCertificatesRequest.


        :param marker: The marker of this ListServerCertificatesRequest.
        :type marker: str
        """

        self._marker = marker

    @property
    def max_items(self) -> int:
        """Gets the max_items of this ListServerCertificatesRequest.


        :return: The max_items of this ListServerCertificatesRequest.
        :rtype: int
        """
        return self._max_items

    @max_items.setter
    def max_items(self, max_items: int):
        """Sets the max_items of this ListServerCertificatesRequest.


        :param max_items: The max_items of this ListServerCertificatesRequest.
        :type max_items: int
        """

        self._max_items = max_items
