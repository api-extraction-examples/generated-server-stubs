from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.node_state import NodeState
from openapi_server import util

from openapi_server.models.node_state import NodeState  # noqa: E501

class NodeStatus(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, addr=None, message=None, state=None):  # noqa: E501
        """NodeStatus - a model defined in OpenAPI

        :param addr: The addr of this NodeStatus.  # noqa: E501
        :type addr: str
        :param message: The message of this NodeStatus.  # noqa: E501
        :type message: str
        :param state: The state of this NodeStatus.  # noqa: E501
        :type state: NodeState
        """
        self.openapi_types = {
            'addr': str,
            'message': str,
            'state': NodeState
        }

        self.attribute_map = {
            'addr': 'Addr',
            'message': 'Message',
            'state': 'State'
        }

        self._addr = addr
        self._message = message
        self._state = state

    @classmethod
    def from_dict(cls, dikt) -> 'NodeStatus':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The NodeStatus of this NodeStatus.  # noqa: E501
        :rtype: NodeStatus
        """
        return util.deserialize_model(dikt, cls)

    @property
    def addr(self) -> str:
        """Gets the addr of this NodeStatus.

        IP address of the node.  # noqa: E501

        :return: The addr of this NodeStatus.
        :rtype: str
        """
        return self._addr

    @addr.setter
    def addr(self, addr: str):
        """Sets the addr of this NodeStatus.

        IP address of the node.  # noqa: E501

        :param addr: The addr of this NodeStatus.
        :type addr: str
        """

        self._addr = addr

    @property
    def message(self) -> str:
        """Gets the message of this NodeStatus.


        :return: The message of this NodeStatus.
        :rtype: str
        """
        return self._message

    @message.setter
    def message(self, message: str):
        """Sets the message of this NodeStatus.


        :param message: The message of this NodeStatus.
        :type message: str
        """

        self._message = message

    @property
    def state(self) -> NodeState:
        """Gets the state of this NodeStatus.


        :return: The state of this NodeStatus.
        :rtype: NodeState
        """
        return self._state

    @state.setter
    def state(self, state: NodeState):
        """Sets the state of this NodeStatus.


        :param state: The state of this NodeStatus.
        :type state: NodeState
        """

        self._state = state