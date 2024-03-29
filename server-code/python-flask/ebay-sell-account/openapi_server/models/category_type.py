from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class CategoryType(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, default=None, name=None):  # noqa: E501
        """CategoryType - a model defined in OpenAPI

        :param default: The default of this CategoryType.  # noqa: E501
        :type default: bool
        :param name: The name of this CategoryType.  # noqa: E501
        :type name: str
        """
        self.openapi_types = {
            'default': bool,
            'name': str
        }

        self.attribute_map = {
            'default': 'default',
            'name': 'name'
        }

        self._default = default
        self._name = name

    @classmethod
    def from_dict(cls, dikt) -> 'CategoryType':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The CategoryType of this CategoryType.  # noqa: E501
        :rtype: CategoryType
        """
        return util.deserialize_model(dikt, cls)

    @property
    def default(self) -> bool:
        """Gets the default of this CategoryType.

        <span class=\"tablenote\"><strong>Note:</strong> This field has been deprecated and is no longer used.<ul><li>Do not include this field in any <b>create</b> or <b>update</b> method.</li><li>This field may be returned within the payload of a <b>get</b> method, but it can be ignored.</li></ul></span>  # noqa: E501

        :return: The default of this CategoryType.
        :rtype: bool
        """
        return self._default

    @default.setter
    def default(self, default: bool):
        """Sets the default of this CategoryType.

        <span class=\"tablenote\"><strong>Note:</strong> This field has been deprecated and is no longer used.<ul><li>Do not include this field in any <b>create</b> or <b>update</b> method.</li><li>This field may be returned within the payload of a <b>get</b> method, but it can be ignored.</li></ul></span>  # noqa: E501

        :param default: The default of this CategoryType.
        :type default: bool
        """

        self._default = default

    @property
    def name(self) -> str:
        """Gets the name of this CategoryType.

        The category type to which the policy applies (motor vehicles or non-motor vehicles). <br /><br />The <code>MOTORS_VEHICLES</code> category type is not valid for return policies. eBay flows do not support the return of motor vehicles. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:CategoryTypeEnum'>eBay API documentation</a>  # noqa: E501

        :return: The name of this CategoryType.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this CategoryType.

        The category type to which the policy applies (motor vehicles or non-motor vehicles). <br /><br />The <code>MOTORS_VEHICLES</code> category type is not valid for return policies. eBay flows do not support the return of motor vehicles. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/api:CategoryTypeEnum'>eBay API documentation</a>  # noqa: E501

        :param name: The name of this CategoryType.
        :type name: str
        """

        self._name = name
