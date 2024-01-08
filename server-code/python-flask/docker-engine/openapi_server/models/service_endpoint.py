from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.endpoint_port_config import EndpointPortConfig
from openapi_server.models.endpoint_spec import EndpointSpec
from openapi_server.models.service_endpoint_virtual_ips_inner import ServiceEndpointVirtualIPsInner
from openapi_server import util

from openapi_server.models.endpoint_port_config import EndpointPortConfig  # noqa: E501
from openapi_server.models.endpoint_spec import EndpointSpec  # noqa: E501
from openapi_server.models.service_endpoint_virtual_ips_inner import ServiceEndpointVirtualIPsInner  # noqa: E501

class ServiceEndpoint(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, ports=None, spec=None, virtual_ips=None):  # noqa: E501
        """ServiceEndpoint - a model defined in OpenAPI

        :param ports: The ports of this ServiceEndpoint.  # noqa: E501
        :type ports: List[EndpointPortConfig]
        :param spec: The spec of this ServiceEndpoint.  # noqa: E501
        :type spec: EndpointSpec
        :param virtual_ips: The virtual_ips of this ServiceEndpoint.  # noqa: E501
        :type virtual_ips: List[ServiceEndpointVirtualIPsInner]
        """
        self.openapi_types = {
            'ports': List[EndpointPortConfig],
            'spec': EndpointSpec,
            'virtual_ips': List[ServiceEndpointVirtualIPsInner]
        }

        self.attribute_map = {
            'ports': 'Ports',
            'spec': 'Spec',
            'virtual_ips': 'VirtualIPs'
        }

        self._ports = ports
        self._spec = spec
        self._virtual_ips = virtual_ips

    @classmethod
    def from_dict(cls, dikt) -> 'ServiceEndpoint':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Service_Endpoint of this ServiceEndpoint.  # noqa: E501
        :rtype: ServiceEndpoint
        """
        return util.deserialize_model(dikt, cls)

    @property
    def ports(self) -> List[EndpointPortConfig]:
        """Gets the ports of this ServiceEndpoint.


        :return: The ports of this ServiceEndpoint.
        :rtype: List[EndpointPortConfig]
        """
        return self._ports

    @ports.setter
    def ports(self, ports: List[EndpointPortConfig]):
        """Sets the ports of this ServiceEndpoint.


        :param ports: The ports of this ServiceEndpoint.
        :type ports: List[EndpointPortConfig]
        """

        self._ports = ports

    @property
    def spec(self) -> EndpointSpec:
        """Gets the spec of this ServiceEndpoint.


        :return: The spec of this ServiceEndpoint.
        :rtype: EndpointSpec
        """
        return self._spec

    @spec.setter
    def spec(self, spec: EndpointSpec):
        """Sets the spec of this ServiceEndpoint.


        :param spec: The spec of this ServiceEndpoint.
        :type spec: EndpointSpec
        """

        self._spec = spec

    @property
    def virtual_ips(self) -> List[ServiceEndpointVirtualIPsInner]:
        """Gets the virtual_ips of this ServiceEndpoint.


        :return: The virtual_ips of this ServiceEndpoint.
        :rtype: List[ServiceEndpointVirtualIPsInner]
        """
        return self._virtual_ips

    @virtual_ips.setter
    def virtual_ips(self, virtual_ips: List[ServiceEndpointVirtualIPsInner]):
        """Sets the virtual_ips of this ServiceEndpoint.


        :param virtual_ips: The virtual_ips of this ServiceEndpoint.
        :type virtual_ips: List[ServiceEndpointVirtualIPsInner]
        """

        self._virtual_ips = virtual_ips
