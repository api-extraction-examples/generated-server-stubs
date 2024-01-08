from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class AddClientIDToOpenIDConnectProviderRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, open_id_connect_provider_arn=None, client_id=None):  # noqa: E501
        """AddClientIDToOpenIDConnectProviderRequest - a model defined in OpenAPI

        :param open_id_connect_provider_arn: The open_id_connect_provider_arn of this AddClientIDToOpenIDConnectProviderRequest.  # noqa: E501
        :type open_id_connect_provider_arn: str
        :param client_id: The client_id of this AddClientIDToOpenIDConnectProviderRequest.  # noqa: E501
        :type client_id: str
        """
        self.openapi_types = {
            'open_id_connect_provider_arn': str,
            'client_id': str
        }

        self.attribute_map = {
            'open_id_connect_provider_arn': 'OpenIDConnectProviderArn',
            'client_id': 'ClientID'
        }

        self._open_id_connect_provider_arn = open_id_connect_provider_arn
        self._client_id = client_id

    @classmethod
    def from_dict(cls, dikt) -> 'AddClientIDToOpenIDConnectProviderRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AddClientIDToOpenIDConnectProviderRequest of this AddClientIDToOpenIDConnectProviderRequest.  # noqa: E501
        :rtype: AddClientIDToOpenIDConnectProviderRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def open_id_connect_provider_arn(self) -> str:
        """Gets the open_id_connect_provider_arn of this AddClientIDToOpenIDConnectProviderRequest.


        :return: The open_id_connect_provider_arn of this AddClientIDToOpenIDConnectProviderRequest.
        :rtype: str
        """
        return self._open_id_connect_provider_arn

    @open_id_connect_provider_arn.setter
    def open_id_connect_provider_arn(self, open_id_connect_provider_arn: str):
        """Sets the open_id_connect_provider_arn of this AddClientIDToOpenIDConnectProviderRequest.


        :param open_id_connect_provider_arn: The open_id_connect_provider_arn of this AddClientIDToOpenIDConnectProviderRequest.
        :type open_id_connect_provider_arn: str
        """
        if open_id_connect_provider_arn is None:
            raise ValueError("Invalid value for `open_id_connect_provider_arn`, must not be `None`")  # noqa: E501

        self._open_id_connect_provider_arn = open_id_connect_provider_arn

    @property
    def client_id(self) -> str:
        """Gets the client_id of this AddClientIDToOpenIDConnectProviderRequest.


        :return: The client_id of this AddClientIDToOpenIDConnectProviderRequest.
        :rtype: str
        """
        return self._client_id

    @client_id.setter
    def client_id(self, client_id: str):
        """Sets the client_id of this AddClientIDToOpenIDConnectProviderRequest.


        :param client_id: The client_id of this AddClientIDToOpenIDConnectProviderRequest.
        :type client_id: str
        """
        if client_id is None:
            raise ValueError("Invalid value for `client_id`, must not be `None`")  # noqa: E501

        self._client_id = client_id
