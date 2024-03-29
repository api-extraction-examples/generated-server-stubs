from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class PortBinding(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, host_ip=None, host_port=None):  # noqa: E501
        """PortBinding - a model defined in OpenAPI

        :param host_ip: The host_ip of this PortBinding.  # noqa: E501
        :type host_ip: str
        :param host_port: The host_port of this PortBinding.  # noqa: E501
        :type host_port: str
        """
        self.openapi_types = {
            'host_ip': str,
            'host_port': str
        }

        self.attribute_map = {
            'host_ip': 'HostIp',
            'host_port': 'HostPort'
        }

        self._host_ip = host_ip
        self._host_port = host_port

    @classmethod
    def from_dict(cls, dikt) -> 'PortBinding':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PortBinding of this PortBinding.  # noqa: E501
        :rtype: PortBinding
        """
        return util.deserialize_model(dikt, cls)

    @property
    def host_ip(self) -> str:
        """Gets the host_ip of this PortBinding.

        Host IP address that the container's port is mapped to.  # noqa: E501

        :return: The host_ip of this PortBinding.
        :rtype: str
        """
        return self._host_ip

    @host_ip.setter
    def host_ip(self, host_ip: str):
        """Sets the host_ip of this PortBinding.

        Host IP address that the container's port is mapped to.  # noqa: E501

        :param host_ip: The host_ip of this PortBinding.
        :type host_ip: str
        """

        self._host_ip = host_ip

    @property
    def host_port(self) -> str:
        """Gets the host_port of this PortBinding.

        Host port number that the container's port is mapped to.  # noqa: E501

        :return: The host_port of this PortBinding.
        :rtype: str
        """
        return self._host_port

    @host_port.setter
    def host_port(self, host_port: str):
        """Sets the host_port of this PortBinding.

        Host port number that the container's port is mapped to.  # noqa: E501

        :param host_port: The host_port of this PortBinding.
        :type host_port: str
        """

        self._host_port = host_port
