from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class SwarmSpecTaskDefaultsLogDriver(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, name=None, options=None):  # noqa: E501
        """SwarmSpecTaskDefaultsLogDriver - a model defined in OpenAPI

        :param name: The name of this SwarmSpecTaskDefaultsLogDriver.  # noqa: E501
        :type name: str
        :param options: The options of this SwarmSpecTaskDefaultsLogDriver.  # noqa: E501
        :type options: Dict[str, str]
        """
        self.openapi_types = {
            'name': str,
            'options': Dict[str, str]
        }

        self.attribute_map = {
            'name': 'Name',
            'options': 'Options'
        }

        self._name = name
        self._options = options

    @classmethod
    def from_dict(cls, dikt) -> 'SwarmSpecTaskDefaultsLogDriver':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The SwarmSpec_TaskDefaults_LogDriver of this SwarmSpecTaskDefaultsLogDriver.  # noqa: E501
        :rtype: SwarmSpecTaskDefaultsLogDriver
        """
        return util.deserialize_model(dikt, cls)

    @property
    def name(self) -> str:
        """Gets the name of this SwarmSpecTaskDefaultsLogDriver.

        The log driver to use as a default for new tasks.   # noqa: E501

        :return: The name of this SwarmSpecTaskDefaultsLogDriver.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this SwarmSpecTaskDefaultsLogDriver.

        The log driver to use as a default for new tasks.   # noqa: E501

        :param name: The name of this SwarmSpecTaskDefaultsLogDriver.
        :type name: str
        """

        self._name = name

    @property
    def options(self) -> Dict[str, str]:
        """Gets the options of this SwarmSpecTaskDefaultsLogDriver.

        Driver-specific options for the selectd log driver, specified as key/value pairs.   # noqa: E501

        :return: The options of this SwarmSpecTaskDefaultsLogDriver.
        :rtype: Dict[str, str]
        """
        return self._options

    @options.setter
    def options(self, options: Dict[str, str]):
        """Sets the options of this SwarmSpecTaskDefaultsLogDriver.

        Driver-specific options for the selectd log driver, specified as key/value pairs.   # noqa: E501

        :param options: The options of this SwarmSpecTaskDefaultsLogDriver.
        :type options: Dict[str, str]
        """

        self._options = options
