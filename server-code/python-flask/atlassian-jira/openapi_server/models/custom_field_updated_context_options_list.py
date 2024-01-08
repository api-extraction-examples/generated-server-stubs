from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.custom_field_option_update import CustomFieldOptionUpdate
from openapi_server import util

from openapi_server.models.custom_field_option_update import CustomFieldOptionUpdate  # noqa: E501

class CustomFieldUpdatedContextOptionsList(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, options=None):  # noqa: E501
        """CustomFieldUpdatedContextOptionsList - a model defined in OpenAPI

        :param options: The options of this CustomFieldUpdatedContextOptionsList.  # noqa: E501
        :type options: List[CustomFieldOptionUpdate]
        """
        self.openapi_types = {
            'options': List[CustomFieldOptionUpdate]
        }

        self.attribute_map = {
            'options': 'options'
        }

        self._options = options

    @classmethod
    def from_dict(cls, dikt) -> 'CustomFieldUpdatedContextOptionsList':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CustomFieldUpdatedContextOptionsList of this CustomFieldUpdatedContextOptionsList.  # noqa: E501
        :rtype: CustomFieldUpdatedContextOptionsList
        """
        return util.deserialize_model(dikt, cls)

    @property
    def options(self) -> List[CustomFieldOptionUpdate]:
        """Gets the options of this CustomFieldUpdatedContextOptionsList.

        The updated custom field options.  # noqa: E501

        :return: The options of this CustomFieldUpdatedContextOptionsList.
        :rtype: List[CustomFieldOptionUpdate]
        """
        return self._options

    @options.setter
    def options(self, options: List[CustomFieldOptionUpdate]):
        """Sets the options of this CustomFieldUpdatedContextOptionsList.

        The updated custom field options.  # noqa: E501

        :param options: The options of this CustomFieldUpdatedContextOptionsList.
        :type options: List[CustomFieldOptionUpdate]
        """

        self._options = options
