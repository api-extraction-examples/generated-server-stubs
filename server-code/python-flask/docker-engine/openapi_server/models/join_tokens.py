from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class JoinTokens(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, manager=None, worker=None):  # noqa: E501
        """JoinTokens - a model defined in OpenAPI

        :param manager: The manager of this JoinTokens.  # noqa: E501
        :type manager: str
        :param worker: The worker of this JoinTokens.  # noqa: E501
        :type worker: str
        """
        self.openapi_types = {
            'manager': str,
            'worker': str
        }

        self.attribute_map = {
            'manager': 'Manager',
            'worker': 'Worker'
        }

        self._manager = manager
        self._worker = worker

    @classmethod
    def from_dict(cls, dikt) -> 'JoinTokens':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The JoinTokens of this JoinTokens.  # noqa: E501
        :rtype: JoinTokens
        """
        return util.deserialize_model(dikt, cls)

    @property
    def manager(self) -> str:
        """Gets the manager of this JoinTokens.

        The token managers can use to join the swarm.   # noqa: E501

        :return: The manager of this JoinTokens.
        :rtype: str
        """
        return self._manager

    @manager.setter
    def manager(self, manager: str):
        """Sets the manager of this JoinTokens.

        The token managers can use to join the swarm.   # noqa: E501

        :param manager: The manager of this JoinTokens.
        :type manager: str
        """

        self._manager = manager

    @property
    def worker(self) -> str:
        """Gets the worker of this JoinTokens.

        The token workers can use to join the swarm.   # noqa: E501

        :return: The worker of this JoinTokens.
        :rtype: str
        """
        return self._worker

    @worker.setter
    def worker(self, worker: str):
        """Sets the worker of this JoinTokens.

        The token workers can use to join the swarm.   # noqa: E501

        :param worker: The worker of this JoinTokens.
        :type worker: str
        """

        self._worker = worker
