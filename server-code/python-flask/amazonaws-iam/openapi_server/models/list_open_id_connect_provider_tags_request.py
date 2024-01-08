from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ListOpenIDConnectProviderTagsRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, open_id_connect_provider_arn=None, marker=None, max_items=None):  # noqa: E501
        """ListOpenIDConnectProviderTagsRequest - a model defined in OpenAPI

        :param open_id_connect_provider_arn: The open_id_connect_provider_arn of this ListOpenIDConnectProviderTagsRequest.  # noqa: E501
        :type open_id_connect_provider_arn: str
        :param marker: The marker of this ListOpenIDConnectProviderTagsRequest.  # noqa: E501
        :type marker: str
        :param max_items: The max_items of this ListOpenIDConnectProviderTagsRequest.  # noqa: E501
        :type max_items: int
        """
        self.openapi_types = {
            'open_id_connect_provider_arn': str,
            'marker': str,
            'max_items': int
        }

        self.attribute_map = {
            'open_id_connect_provider_arn': 'OpenIDConnectProviderArn',
            'marker': 'Marker',
            'max_items': 'MaxItems'
        }

        self._open_id_connect_provider_arn = open_id_connect_provider_arn
        self._marker = marker
        self._max_items = max_items

    @classmethod
    def from_dict(cls, dikt) -> 'ListOpenIDConnectProviderTagsRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ListOpenIDConnectProviderTagsRequest of this ListOpenIDConnectProviderTagsRequest.  # noqa: E501
        :rtype: ListOpenIDConnectProviderTagsRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def open_id_connect_provider_arn(self) -> str:
        """Gets the open_id_connect_provider_arn of this ListOpenIDConnectProviderTagsRequest.


        :return: The open_id_connect_provider_arn of this ListOpenIDConnectProviderTagsRequest.
        :rtype: str
        """
        return self._open_id_connect_provider_arn

    @open_id_connect_provider_arn.setter
    def open_id_connect_provider_arn(self, open_id_connect_provider_arn: str):
        """Sets the open_id_connect_provider_arn of this ListOpenIDConnectProviderTagsRequest.


        :param open_id_connect_provider_arn: The open_id_connect_provider_arn of this ListOpenIDConnectProviderTagsRequest.
        :type open_id_connect_provider_arn: str
        """
        if open_id_connect_provider_arn is None:
            raise ValueError("Invalid value for `open_id_connect_provider_arn`, must not be `None`")  # noqa: E501

        self._open_id_connect_provider_arn = open_id_connect_provider_arn

    @property
    def marker(self) -> str:
        """Gets the marker of this ListOpenIDConnectProviderTagsRequest.


        :return: The marker of this ListOpenIDConnectProviderTagsRequest.
        :rtype: str
        """
        return self._marker

    @marker.setter
    def marker(self, marker: str):
        """Sets the marker of this ListOpenIDConnectProviderTagsRequest.


        :param marker: The marker of this ListOpenIDConnectProviderTagsRequest.
        :type marker: str
        """

        self._marker = marker

    @property
    def max_items(self) -> int:
        """Gets the max_items of this ListOpenIDConnectProviderTagsRequest.


        :return: The max_items of this ListOpenIDConnectProviderTagsRequest.
        :rtype: int
        """
        return self._max_items

    @max_items.setter
    def max_items(self, max_items: int):
        """Sets the max_items of this ListOpenIDConnectProviderTagsRequest.


        :param max_items: The max_items of this ListOpenIDConnectProviderTagsRequest.
        :type max_items: int
        """

        self._max_items = max_items
