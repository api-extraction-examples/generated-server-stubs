from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class ConnectModules(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, modules=None):  # noqa: E501
        """ConnectModules - a model defined in OpenAPI

        :param modules: The modules of this ConnectModules.  # noqa: E501
        :type modules: List[object]
        """
        self.openapi_types = {
            'modules': List[object]
        }

        self.attribute_map = {
            'modules': 'modules'
        }

        self._modules = modules

    @classmethod
    def from_dict(cls, dikt) -> 'ConnectModules':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ConnectModules of this ConnectModules.  # noqa: E501
        :rtype: ConnectModules
        """
        return util.deserialize_model(dikt, cls)

    @property
    def modules(self) -> List[object]:
        """Gets the modules of this ConnectModules.

        A list of app modules in the same format as the `modules` property in the [app descriptor](https://developer.atlassian.com/cloud/jira/platform/app-descriptor/).  # noqa: E501

        :return: The modules of this ConnectModules.
        :rtype: List[object]
        """
        return self._modules

    @modules.setter
    def modules(self, modules: List[object]):
        """Sets the modules of this ConnectModules.

        A list of app modules in the same format as the `modules` property in the [app descriptor](https://developer.atlassian.com/cloud/jira/platform/app-descriptor/).  # noqa: E501

        :param modules: The modules of this ConnectModules.
        :type modules: List[object]
        """
        if modules is None:
            raise ValueError("Invalid value for `modules`, must not be `None`")  # noqa: E501

        self._modules = modules