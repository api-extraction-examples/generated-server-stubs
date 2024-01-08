from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.swarm_spec_task_defaults_log_driver import SwarmSpecTaskDefaultsLogDriver
from openapi_server import util

from openapi_server.models.swarm_spec_task_defaults_log_driver import SwarmSpecTaskDefaultsLogDriver  # noqa: E501

class SwarmSpecTaskDefaults(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, log_driver=None):  # noqa: E501
        """SwarmSpecTaskDefaults - a model defined in OpenAPI

        :param log_driver: The log_driver of this SwarmSpecTaskDefaults.  # noqa: E501
        :type log_driver: SwarmSpecTaskDefaultsLogDriver
        """
        self.openapi_types = {
            'log_driver': SwarmSpecTaskDefaultsLogDriver
        }

        self.attribute_map = {
            'log_driver': 'LogDriver'
        }

        self._log_driver = log_driver

    @classmethod
    def from_dict(cls, dikt) -> 'SwarmSpecTaskDefaults':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The SwarmSpec_TaskDefaults of this SwarmSpecTaskDefaults.  # noqa: E501
        :rtype: SwarmSpecTaskDefaults
        """
        return util.deserialize_model(dikt, cls)

    @property
    def log_driver(self) -> SwarmSpecTaskDefaultsLogDriver:
        """Gets the log_driver of this SwarmSpecTaskDefaults.


        :return: The log_driver of this SwarmSpecTaskDefaults.
        :rtype: SwarmSpecTaskDefaultsLogDriver
        """
        return self._log_driver

    @log_driver.setter
    def log_driver(self, log_driver: SwarmSpecTaskDefaultsLogDriver):
        """Sets the log_driver of this SwarmSpecTaskDefaults.


        :param log_driver: The log_driver of this SwarmSpecTaskDefaults.
        :type log_driver: SwarmSpecTaskDefaultsLogDriver
        """

        self._log_driver = log_driver