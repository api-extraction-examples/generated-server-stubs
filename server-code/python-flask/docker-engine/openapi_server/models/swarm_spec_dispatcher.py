from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class SwarmSpecDispatcher(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, heartbeat_period=None):  # noqa: E501
        """SwarmSpecDispatcher - a model defined in OpenAPI

        :param heartbeat_period: The heartbeat_period of this SwarmSpecDispatcher.  # noqa: E501
        :type heartbeat_period: int
        """
        self.openapi_types = {
            'heartbeat_period': int
        }

        self.attribute_map = {
            'heartbeat_period': 'HeartbeatPeriod'
        }

        self._heartbeat_period = heartbeat_period

    @classmethod
    def from_dict(cls, dikt) -> 'SwarmSpecDispatcher':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The SwarmSpec_Dispatcher of this SwarmSpecDispatcher.  # noqa: E501
        :rtype: SwarmSpecDispatcher
        """
        return util.deserialize_model(dikt, cls)

    @property
    def heartbeat_period(self) -> int:
        """Gets the heartbeat_period of this SwarmSpecDispatcher.

        The delay for an agent to send a heartbeat to the dispatcher.  # noqa: E501

        :return: The heartbeat_period of this SwarmSpecDispatcher.
        :rtype: int
        """
        return self._heartbeat_period

    @heartbeat_period.setter
    def heartbeat_period(self, heartbeat_period: int):
        """Sets the heartbeat_period of this SwarmSpecDispatcher.

        The delay for an agent to send a heartbeat to the dispatcher.  # noqa: E501

        :param heartbeat_period: The heartbeat_period of this SwarmSpecDispatcher.
        :type heartbeat_period: int
        """

        self._heartbeat_period = heartbeat_period
