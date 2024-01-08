from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ModifyDependenciesRequest(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, dependencies=None):  # noqa: E501
        """ModifyDependenciesRequest - a model defined in OpenAPI

        :param dependencies: The dependencies of this ModifyDependenciesRequest.  # noqa: E501
        :type dependencies: List[str]
        """
        self.openapi_types = {
            'dependencies': List[str]
        }

        self.attribute_map = {
            'dependencies': 'dependencies'
        }

        self._dependencies = dependencies

    @classmethod
    def from_dict(cls, dikt) -> 'ModifyDependenciesRequest':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ModifyDependenciesRequest of this ModifyDependenciesRequest.  # noqa: E501
        :rtype: ModifyDependenciesRequest
        """
        return util.deserialize_model(dikt, cls)

    @property
    def dependencies(self) -> List[str]:
        """Gets the dependencies of this ModifyDependenciesRequest.

        An array of task gids that a task depends on.  # noqa: E501

        :return: The dependencies of this ModifyDependenciesRequest.
        :rtype: List[str]
        """
        return self._dependencies

    @dependencies.setter
    def dependencies(self, dependencies: List[str]):
        """Sets the dependencies of this ModifyDependenciesRequest.

        An array of task gids that a task depends on.  # noqa: E501

        :param dependencies: The dependencies of this ModifyDependenciesRequest.
        :type dependencies: List[str]
        """

        self._dependencies = dependencies