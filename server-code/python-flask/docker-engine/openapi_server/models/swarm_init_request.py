from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.swarm_spec import SwarmSpec
from openapi_server import util

from openapi_server.models.swarm_spec import SwarmSpec  # noqa: E501

class SwarmInitRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, advertise_addr=None, data_path_addr=None, force_new_cluster=None, listen_addr=None, spec=None):  # noqa: E501
        """SwarmInitRequest - a model defined in OpenAPI

        :param advertise_addr: The advertise_addr of this SwarmInitRequest.  # noqa: E501
        :type advertise_addr: str
        :param data_path_addr: The data_path_addr of this SwarmInitRequest.  # noqa: E501
        :type data_path_addr: str
        :param force_new_cluster: The force_new_cluster of this SwarmInitRequest.  # noqa: E501
        :type force_new_cluster: bool
        :param listen_addr: The listen_addr of this SwarmInitRequest.  # noqa: E501
        :type listen_addr: str
        :param spec: The spec of this SwarmInitRequest.  # noqa: E501
        :type spec: SwarmSpec
        """
        self.openapi_types = {
            'advertise_addr': str,
            'data_path_addr': str,
            'force_new_cluster': bool,
            'listen_addr': str,
            'spec': SwarmSpec
        }

        self.attribute_map = {
            'advertise_addr': 'AdvertiseAddr',
            'data_path_addr': 'DataPathAddr',
            'force_new_cluster': 'ForceNewCluster',
            'listen_addr': 'ListenAddr',
            'spec': 'Spec'
        }

        self._advertise_addr = advertise_addr
        self._data_path_addr = data_path_addr
        self._force_new_cluster = force_new_cluster
        self._listen_addr = listen_addr
        self._spec = spec

    @classmethod
    def from_dict(cls, dikt) -> 'SwarmInitRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The SwarmInit_request of this SwarmInitRequest.  # noqa: E501
        :rtype: SwarmInitRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def advertise_addr(self) -> str:
        """Gets the advertise_addr of this SwarmInitRequest.

        Externally reachable address advertised to other nodes. This can either be an address/port combination in the form `192.168.1.1:4567`, or an interface followed by a port number, like `eth0:4567`. If the port number is omitted, the port number from the listen address is used. If `AdvertiseAddr` is not specified, it will be automatically detected when possible.  # noqa: E501

        :return: The advertise_addr of this SwarmInitRequest.
        :rtype: str
        """
        return self._advertise_addr

    @advertise_addr.setter
    def advertise_addr(self, advertise_addr: str):
        """Sets the advertise_addr of this SwarmInitRequest.

        Externally reachable address advertised to other nodes. This can either be an address/port combination in the form `192.168.1.1:4567`, or an interface followed by a port number, like `eth0:4567`. If the port number is omitted, the port number from the listen address is used. If `AdvertiseAddr` is not specified, it will be automatically detected when possible.  # noqa: E501

        :param advertise_addr: The advertise_addr of this SwarmInitRequest.
        :type advertise_addr: str
        """

        self._advertise_addr = advertise_addr

    @property
    def data_path_addr(self) -> str:
        """Gets the data_path_addr of this SwarmInitRequest.

        Address or interface to use for data path traffic (format: `<ip|interface>`), for example,  `192.168.1.1`, or an interface, like `eth0`. If `DataPathAddr` is unspecified, the same address as `AdvertiseAddr` is used.  The `DataPathAddr` specifies the address that global scope network drivers will publish towards other nodes in order to reach the containers running on this node. Using this parameter it is possible to separate the container data traffic from the management traffic of the cluster.   # noqa: E501

        :return: The data_path_addr of this SwarmInitRequest.
        :rtype: str
        """
        return self._data_path_addr

    @data_path_addr.setter
    def data_path_addr(self, data_path_addr: str):
        """Sets the data_path_addr of this SwarmInitRequest.

        Address or interface to use for data path traffic (format: `<ip|interface>`), for example,  `192.168.1.1`, or an interface, like `eth0`. If `DataPathAddr` is unspecified, the same address as `AdvertiseAddr` is used.  The `DataPathAddr` specifies the address that global scope network drivers will publish towards other nodes in order to reach the containers running on this node. Using this parameter it is possible to separate the container data traffic from the management traffic of the cluster.   # noqa: E501

        :param data_path_addr: The data_path_addr of this SwarmInitRequest.
        :type data_path_addr: str
        """

        self._data_path_addr = data_path_addr

    @property
    def force_new_cluster(self) -> bool:
        """Gets the force_new_cluster of this SwarmInitRequest.

        Force creation of a new swarm.  # noqa: E501

        :return: The force_new_cluster of this SwarmInitRequest.
        :rtype: bool
        """
        return self._force_new_cluster

    @force_new_cluster.setter
    def force_new_cluster(self, force_new_cluster: bool):
        """Sets the force_new_cluster of this SwarmInitRequest.

        Force creation of a new swarm.  # noqa: E501

        :param force_new_cluster: The force_new_cluster of this SwarmInitRequest.
        :type force_new_cluster: bool
        """

        self._force_new_cluster = force_new_cluster

    @property
    def listen_addr(self) -> str:
        """Gets the listen_addr of this SwarmInitRequest.

        Listen address used for inter-manager communication, as well as determining the networking interface used for the VXLAN Tunnel Endpoint (VTEP). This can either be an address/port combination in the form `192.168.1.1:4567`, or an interface followed by a port number, like `eth0:4567`. If the port number is omitted, the default swarm listening port is used.  # noqa: E501

        :return: The listen_addr of this SwarmInitRequest.
        :rtype: str
        """
        return self._listen_addr

    @listen_addr.setter
    def listen_addr(self, listen_addr: str):
        """Sets the listen_addr of this SwarmInitRequest.

        Listen address used for inter-manager communication, as well as determining the networking interface used for the VXLAN Tunnel Endpoint (VTEP). This can either be an address/port combination in the form `192.168.1.1:4567`, or an interface followed by a port number, like `eth0:4567`. If the port number is omitted, the default swarm listening port is used.  # noqa: E501

        :param listen_addr: The listen_addr of this SwarmInitRequest.
        :type listen_addr: str
        """

        self._listen_addr = listen_addr

    @property
    def spec(self) -> SwarmSpec:
        """Gets the spec of this SwarmInitRequest.


        :return: The spec of this SwarmInitRequest.
        :rtype: SwarmSpec
        """
        return self._spec

    @spec.setter
    def spec(self, spec: SwarmSpec):
        """Sets the spec of this SwarmInitRequest.


        :param spec: The spec of this SwarmInitRequest.
        :type spec: SwarmSpec
        """

        self._spec = spec
