from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class PeerNode(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, addr=None, node_id=None):  # noqa: E501
        """PeerNode - a model defined in OpenAPI

        :param addr: The addr of this PeerNode.  # noqa: E501
        :type addr: str
        :param node_id: The node_id of this PeerNode.  # noqa: E501
        :type node_id: str
        """
        self.openapi_types = {
            'addr': str,
            'node_id': str
        }

        self.attribute_map = {
            'addr': 'Addr',
            'node_id': 'NodeID'
        }

        self._addr = addr
        self._node_id = node_id

    @classmethod
    def from_dict(cls, dikt) -> 'PeerNode':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The PeerNode of this PeerNode.  # noqa: E501
        :rtype: PeerNode
        """
        return util.deserialize_model(dikt, cls)

    @property
    def addr(self) -> str:
        """Gets the addr of this PeerNode.

        IP address and ports at which this node can be reached.   # noqa: E501

        :return: The addr of this PeerNode.
        :rtype: str
        """
        return self._addr

    @addr.setter
    def addr(self, addr: str):
        """Sets the addr of this PeerNode.

        IP address and ports at which this node can be reached.   # noqa: E501

        :param addr: The addr of this PeerNode.
        :type addr: str
        """

        self._addr = addr

    @property
    def node_id(self) -> str:
        """Gets the node_id of this PeerNode.

        Unique identifier of for this node in the swarm.  # noqa: E501

        :return: The node_id of this PeerNode.
        :rtype: str
        """
        return self._node_id

    @node_id.setter
    def node_id(self, node_id: str):
        """Sets the node_id of this PeerNode.

        Unique identifier of for this node in the swarm.  # noqa: E501

        :param node_id: The node_id of this PeerNode.
        :type node_id: str
        """

        self._node_id = node_id