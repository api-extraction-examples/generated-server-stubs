from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ListOpenIDConnectProvidersResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, open_id_connect_provider_list=None):  # noqa: E501
        """ListOpenIDConnectProvidersResponse - a model defined in OpenAPI

        :param open_id_connect_provider_list: The open_id_connect_provider_list of this ListOpenIDConnectProvidersResponse.  # noqa: E501
        :type open_id_connect_provider_list: List
        """
        self.openapi_types = {
            'open_id_connect_provider_list': List
        }

        self.attribute_map = {
            'open_id_connect_provider_list': 'OpenIDConnectProviderList'
        }

        self._open_id_connect_provider_list = open_id_connect_provider_list

    @classmethod
    def from_dict(cls, dikt) -> 'ListOpenIDConnectProvidersResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ListOpenIDConnectProvidersResponse of this ListOpenIDConnectProvidersResponse.  # noqa: E501
        :rtype: ListOpenIDConnectProvidersResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def open_id_connect_provider_list(self) -> List:
        """Gets the open_id_connect_provider_list of this ListOpenIDConnectProvidersResponse.


        :return: The open_id_connect_provider_list of this ListOpenIDConnectProvidersResponse.
        :rtype: List
        """
        return self._open_id_connect_provider_list

    @open_id_connect_provider_list.setter
    def open_id_connect_provider_list(self, open_id_connect_provider_list: List):
        """Sets the open_id_connect_provider_list of this ListOpenIDConnectProvidersResponse.


        :param open_id_connect_provider_list: The open_id_connect_provider_list of this ListOpenIDConnectProvidersResponse.
        :type open_id_connect_provider_list: List
        """

        self._open_id_connect_provider_list = open_id_connect_provider_list
