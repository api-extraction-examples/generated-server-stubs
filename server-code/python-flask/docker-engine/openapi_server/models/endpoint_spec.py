from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.endpoint_port_config import EndpointPortConfig
from openapi_server import util

from openapi_server.models.endpoint_port_config import EndpointPortConfig  # noqa: E501

class EndpointSpec(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, mode='vip', ports=None):  # noqa: E501
        """EndpointSpec - a model defined in OpenAPI

        :param mode: The mode of this EndpointSpec.  # noqa: E501
        :type mode: str
        :param ports: The ports of this EndpointSpec.  # noqa: E501
        :type ports: List[EndpointPortConfig]
        """
        self.openapi_types = {
            'mode': str,
            'ports': List[EndpointPortConfig]
        }

        self.attribute_map = {
            'mode': 'Mode',
            'ports': 'Ports'
        }

        self._mode = mode
        self._ports = ports

    @classmethod
    def from_dict(cls, dikt) -> 'EndpointSpec':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The EndpointSpec of this EndpointSpec.  # noqa: E501
        :rtype: EndpointSpec
        """
        return util.deserialize_model(dikt, cls)

    @property
    def mode(self) -> str:
        """Gets the mode of this EndpointSpec.

        The mode of resolution to use for internal load balancing between tasks.  # noqa: E501

        :return: The mode of this EndpointSpec.
        :rtype: str
        """
        return self._mode

    @mode.setter
    def mode(self, mode: str):
        """Sets the mode of this EndpointSpec.

        The mode of resolution to use for internal load balancing between tasks.  # noqa: E501

        :param mode: The mode of this EndpointSpec.
        :type mode: str
        """
        allowed_values = ["vip", "dnsrr"]  # noqa: E501
        if mode not in allowed_values:
            raise ValueError(
                "Invalid value for `mode` ({0}), must be one of {1}"
                .format(mode, allowed_values)
            )

        self._mode = mode

    @property
    def ports(self) -> List[EndpointPortConfig]:
        """Gets the ports of this EndpointSpec.

        List of exposed ports that this service is accessible on from the outside. Ports can only be provided if `vip` resolution mode is used.  # noqa: E501

        :return: The ports of this EndpointSpec.
        :rtype: List[EndpointPortConfig]
        """
        return self._ports

    @ports.setter
    def ports(self, ports: List[EndpointPortConfig]):
        """Sets the ports of this EndpointSpec.

        List of exposed ports that this service is accessible on from the outside. Ports can only be provided if `vip` resolution mode is used.  # noqa: E501

        :param ports: The ports of this EndpointSpec.
        :type ports: List[EndpointPortConfig]
        """

        self._ports = ports
