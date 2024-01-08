from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.contextual_configuration import ContextualConfiguration
from openapi_server import util

from openapi_server.models.contextual_configuration import ContextualConfiguration  # noqa: E501

class CustomFieldConfigurations(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, configurations=None):  # noqa: E501
        """CustomFieldConfigurations - a model defined in OpenAPI

        :param configurations: The configurations of this CustomFieldConfigurations.  # noqa: E501
        :type configurations: list[ContextualConfiguration]
        """
        self.openapi_types = {
            'configurations': list[ContextualConfiguration]
        }

        self.attribute_map = {
            'configurations': 'configurations'
        }

        self._configurations = configurations

    @classmethod
    def from_dict(cls, dikt) -> 'CustomFieldConfigurations':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CustomFieldConfigurations of this CustomFieldConfigurations.  # noqa: E501
        :rtype: CustomFieldConfigurations
        """
        return util.deserialize_model(dikt, cls)

    @property
    def configurations(self) -> list[ContextualConfiguration]:
        """Gets the configurations of this CustomFieldConfigurations.

        The list of custom field configuration details.  # noqa: E501

        :return: The configurations of this CustomFieldConfigurations.
        :rtype: list[ContextualConfiguration]
        """
        return self._configurations

    @configurations.setter
    def configurations(self, configurations: list[ContextualConfiguration]):
        """Sets the configurations of this CustomFieldConfigurations.

        The list of custom field configuration details.  # noqa: E501

        :param configurations: The configurations of this CustomFieldConfigurations.
        :type configurations: list[ContextualConfiguration]
        """
        if configurations is None:
            raise ValueError("Invalid value for `configurations`, must not be `None`")  # noqa: E501
        if configurations is not None and len(configurations) > 1000:
            raise ValueError("Invalid value for `configurations`, number of items must be less than or equal to `1000`")  # noqa: E501
        if configurations is not None and len(configurations) < 1:
            raise ValueError("Invalid value for `configurations`, number of items must be greater than or equal to `1`")  # noqa: E501

        self._configurations = configurations
