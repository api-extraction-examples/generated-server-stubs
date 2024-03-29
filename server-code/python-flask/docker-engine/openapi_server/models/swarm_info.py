from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.cluster_info import ClusterInfo
from openapi_server.models.local_node_state import LocalNodeState
from openapi_server.models.peer_node import PeerNode
from openapi_server import util

from openapi_server.models.cluster_info import ClusterInfo  # noqa: E501
from openapi_server.models.local_node_state import LocalNodeState  # noqa: E501
from openapi_server.models.peer_node import PeerNode  # noqa: E501

class SwarmInfo(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, cluster=None, control_available=False, error='', local_node_state=None, managers=None, node_addr='', node_id='', nodes=None, remote_managers=None):  # noqa: E501
        """SwarmInfo - a model defined in OpenAPI

        :param cluster: The cluster of this SwarmInfo.  # noqa: E501
        :type cluster: ClusterInfo
        :param control_available: The control_available of this SwarmInfo.  # noqa: E501
        :type control_available: bool
        :param error: The error of this SwarmInfo.  # noqa: E501
        :type error: str
        :param local_node_state: The local_node_state of this SwarmInfo.  # noqa: E501
        :type local_node_state: LocalNodeState
        :param managers: The managers of this SwarmInfo.  # noqa: E501
        :type managers: int
        :param node_addr: The node_addr of this SwarmInfo.  # noqa: E501
        :type node_addr: str
        :param node_id: The node_id of this SwarmInfo.  # noqa: E501
        :type node_id: str
        :param nodes: The nodes of this SwarmInfo.  # noqa: E501
        :type nodes: int
        :param remote_managers: The remote_managers of this SwarmInfo.  # noqa: E501
        :type remote_managers: List[PeerNode]
        """
        self.openapi_types = {
            'cluster': ClusterInfo,
            'control_available': bool,
            'error': str,
            'local_node_state': LocalNodeState,
            'managers': int,
            'node_addr': str,
            'node_id': str,
            'nodes': int,
            'remote_managers': List[PeerNode]
        }

        self.attribute_map = {
            'cluster': 'Cluster',
            'control_available': 'ControlAvailable',
            'error': 'Error',
            'local_node_state': 'LocalNodeState',
            'managers': 'Managers',
            'node_addr': 'NodeAddr',
            'node_id': 'NodeID',
            'nodes': 'Nodes',
            'remote_managers': 'RemoteManagers'
        }

        self._cluster = cluster
        self._control_available = control_available
        self._error = error
        self._local_node_state = local_node_state
        self._managers = managers
        self._node_addr = node_addr
        self._node_id = node_id
        self._nodes = nodes
        self._remote_managers = remote_managers

    @classmethod
    def from_dict(cls, dikt) -> 'SwarmInfo':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The SwarmInfo of this SwarmInfo.  # noqa: E501
        :rtype: SwarmInfo
        """
        return util.deserialize_model(dikt, cls)

    @property
    def cluster(self) -> ClusterInfo:
        """Gets the cluster of this SwarmInfo.


        :return: The cluster of this SwarmInfo.
        :rtype: ClusterInfo
        """
        return self._cluster

    @cluster.setter
    def cluster(self, cluster: ClusterInfo):
        """Sets the cluster of this SwarmInfo.


        :param cluster: The cluster of this SwarmInfo.
        :type cluster: ClusterInfo
        """

        self._cluster = cluster

    @property
    def control_available(self) -> bool:
        """Gets the control_available of this SwarmInfo.


        :return: The control_available of this SwarmInfo.
        :rtype: bool
        """
        return self._control_available

    @control_available.setter
    def control_available(self, control_available: bool):
        """Sets the control_available of this SwarmInfo.


        :param control_available: The control_available of this SwarmInfo.
        :type control_available: bool
        """

        self._control_available = control_available

    @property
    def error(self) -> str:
        """Gets the error of this SwarmInfo.


        :return: The error of this SwarmInfo.
        :rtype: str
        """
        return self._error

    @error.setter
    def error(self, error: str):
        """Sets the error of this SwarmInfo.


        :param error: The error of this SwarmInfo.
        :type error: str
        """

        self._error = error

    @property
    def local_node_state(self) -> LocalNodeState:
        """Gets the local_node_state of this SwarmInfo.


        :return: The local_node_state of this SwarmInfo.
        :rtype: LocalNodeState
        """
        return self._local_node_state

    @local_node_state.setter
    def local_node_state(self, local_node_state: LocalNodeState):
        """Sets the local_node_state of this SwarmInfo.


        :param local_node_state: The local_node_state of this SwarmInfo.
        :type local_node_state: LocalNodeState
        """

        self._local_node_state = local_node_state

    @property
    def managers(self) -> int:
        """Gets the managers of this SwarmInfo.

        Total number of managers in the swarm.  # noqa: E501

        :return: The managers of this SwarmInfo.
        :rtype: int
        """
        return self._managers

    @managers.setter
    def managers(self, managers: int):
        """Sets the managers of this SwarmInfo.

        Total number of managers in the swarm.  # noqa: E501

        :param managers: The managers of this SwarmInfo.
        :type managers: int
        """

        self._managers = managers

    @property
    def node_addr(self) -> str:
        """Gets the node_addr of this SwarmInfo.

        IP address at which this node can be reached by other nodes in the swarm.   # noqa: E501

        :return: The node_addr of this SwarmInfo.
        :rtype: str
        """
        return self._node_addr

    @node_addr.setter
    def node_addr(self, node_addr: str):
        """Sets the node_addr of this SwarmInfo.

        IP address at which this node can be reached by other nodes in the swarm.   # noqa: E501

        :param node_addr: The node_addr of this SwarmInfo.
        :type node_addr: str
        """

        self._node_addr = node_addr

    @property
    def node_id(self) -> str:
        """Gets the node_id of this SwarmInfo.

        Unique identifier of for this node in the swarm.  # noqa: E501

        :return: The node_id of this SwarmInfo.
        :rtype: str
        """
        return self._node_id

    @node_id.setter
    def node_id(self, node_id: str):
        """Sets the node_id of this SwarmInfo.

        Unique identifier of for this node in the swarm.  # noqa: E501

        :param node_id: The node_id of this SwarmInfo.
        :type node_id: str
        """

        self._node_id = node_id

    @property
    def nodes(self) -> int:
        """Gets the nodes of this SwarmInfo.

        Total number of nodes in the swarm.  # noqa: E501

        :return: The nodes of this SwarmInfo.
        :rtype: int
        """
        return self._nodes

    @nodes.setter
    def nodes(self, nodes: int):
        """Sets the nodes of this SwarmInfo.

        Total number of nodes in the swarm.  # noqa: E501

        :param nodes: The nodes of this SwarmInfo.
        :type nodes: int
        """

        self._nodes = nodes

    @property
    def remote_managers(self) -> List[PeerNode]:
        """Gets the remote_managers of this SwarmInfo.

        List of ID's and addresses of other managers in the swarm.   # noqa: E501

        :return: The remote_managers of this SwarmInfo.
        :rtype: List[PeerNode]
        """
        return self._remote_managers

    @remote_managers.setter
    def remote_managers(self, remote_managers: List[PeerNode]):
        """Sets the remote_managers of this SwarmInfo.

        List of ID's and addresses of other managers in the swarm.   # noqa: E501

        :param remote_managers: The remote_managers of this SwarmInfo.
        :type remote_managers: List[PeerNode]
        """

        self._remote_managers = remote_managers
