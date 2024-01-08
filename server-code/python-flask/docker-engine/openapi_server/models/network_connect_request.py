from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.endpoint_settings import EndpointSettings
from openapi_server import util

from openapi_server.models.endpoint_settings import EndpointSettings  # noqa: E501

class NetworkConnectRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, container=None, endpoint_config=None):  # noqa: E501
        """NetworkConnectRequest - a model defined in OpenAPI

        :param container: The container of this NetworkConnectRequest.  # noqa: E501
        :type container: str
        :param endpoint_config: The endpoint_config of this NetworkConnectRequest.  # noqa: E501
        :type endpoint_config: EndpointSettings
        """
        self.openapi_types = {
            'container': str,
            'endpoint_config': EndpointSettings
        }

        self.attribute_map = {
            'container': 'Container',
            'endpoint_config': 'EndpointConfig'
        }

        self._container = container
        self._endpoint_config = endpoint_config

    @classmethod
    def from_dict(cls, dikt) -> 'NetworkConnectRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The NetworkConnect_request of this NetworkConnectRequest.  # noqa: E501
        :rtype: NetworkConnectRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def container(self) -> str:
        """Gets the container of this NetworkConnectRequest.

        The ID or name of the container to connect to the network.  # noqa: E501

        :return: The container of this NetworkConnectRequest.
        :rtype: str
        """
        return self._container

    @container.setter
    def container(self, container: str):
        """Sets the container of this NetworkConnectRequest.

        The ID or name of the container to connect to the network.  # noqa: E501

        :param container: The container of this NetworkConnectRequest.
        :type container: str
        """

        self._container = container

    @property
    def endpoint_config(self) -> EndpointSettings:
        """Gets the endpoint_config of this NetworkConnectRequest.


        :return: The endpoint_config of this NetworkConnectRequest.
        :rtype: EndpointSettings
        """
        return self._endpoint_config

    @endpoint_config.setter
    def endpoint_config(self, endpoint_config: EndpointSettings):
        """Sets the endpoint_config of this NetworkConnectRequest.


        :param endpoint_config: The endpoint_config of this NetworkConnectRequest.
        :type endpoint_config: EndpointSettings
        """

        self._endpoint_config = endpoint_config