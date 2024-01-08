from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ServiceSpecNetworksInner(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, aliases=None, target=None):  # noqa: E501
        """ServiceSpecNetworksInner - a model defined in OpenAPI

        :param aliases: The aliases of this ServiceSpecNetworksInner.  # noqa: E501
        :type aliases: List[str]
        :param target: The target of this ServiceSpecNetworksInner.  # noqa: E501
        :type target: str
        """
        self.openapi_types = {
            'aliases': List[str],
            'target': str
        }

        self.attribute_map = {
            'aliases': 'Aliases',
            'target': 'Target'
        }

        self._aliases = aliases
        self._target = target

    @classmethod
    def from_dict(cls, dikt) -> 'ServiceSpecNetworksInner':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ServiceSpec_Networks_inner of this ServiceSpecNetworksInner.  # noqa: E501
        :rtype: ServiceSpecNetworksInner
        """
        return util.deserialize_model(dikt, cls)

    @property
    def aliases(self) -> List[str]:
        """Gets the aliases of this ServiceSpecNetworksInner.


        :return: The aliases of this ServiceSpecNetworksInner.
        :rtype: List[str]
        """
        return self._aliases

    @aliases.setter
    def aliases(self, aliases: List[str]):
        """Sets the aliases of this ServiceSpecNetworksInner.


        :param aliases: The aliases of this ServiceSpecNetworksInner.
        :type aliases: List[str]
        """

        self._aliases = aliases

    @property
    def target(self) -> str:
        """Gets the target of this ServiceSpecNetworksInner.


        :return: The target of this ServiceSpecNetworksInner.
        :rtype: str
        """
        return self._target

    @target.setter
    def target(self, target: str):
        """Sets the target of this ServiceSpecNetworksInner.


        :param target: The target of this ServiceSpecNetworksInner.
        :type target: str
        """

        self._target = target