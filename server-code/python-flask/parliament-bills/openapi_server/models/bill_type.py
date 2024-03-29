from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.bill_type_category import BillTypeCategory
from openapi_server import util

from openapi_server.models.bill_type_category import BillTypeCategory  # noqa: E501

class BillType(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, category=None, description=None, id=None, name=None):  # noqa: E501
        """BillType - a model defined in OpenAPI

        :param category: The category of this BillType.  # noqa: E501
        :type category: BillTypeCategory
        :param description: The description of this BillType.  # noqa: E501
        :type description: str
        :param id: The id of this BillType.  # noqa: E501
        :type id: int
        :param name: The name of this BillType.  # noqa: E501
        :type name: str
        """
        self.openapi_types = {
            'category': BillTypeCategory,
            'description': str,
            'id': int,
            'name': str
        }

        self.attribute_map = {
            'category': 'category',
            'description': 'description',
            'id': 'id',
            'name': 'name'
        }

        self._category = category
        self._description = description
        self._id = id
        self._name = name

    @classmethod
    def from_dict(cls, dikt) -> 'BillType':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The BillType of this BillType.  # noqa: E501
        :rtype: BillType
        """
        return util.deserialize_model(dikt, cls)

    @property
    def category(self) -> BillTypeCategory:
        """Gets the category of this BillType.


        :return: The category of this BillType.
        :rtype: BillTypeCategory
        """
        return self._category

    @category.setter
    def category(self, category: BillTypeCategory):
        """Sets the category of this BillType.


        :param category: The category of this BillType.
        :type category: BillTypeCategory
        """

        self._category = category

    @property
    def description(self) -> str:
        """Gets the description of this BillType.


        :return: The description of this BillType.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this BillType.


        :param description: The description of this BillType.
        :type description: str
        """

        self._description = description

    @property
    def id(self) -> int:
        """Gets the id of this BillType.


        :return: The id of this BillType.
        :rtype: int
        """
        return self._id

    @id.setter
    def id(self, id: int):
        """Sets the id of this BillType.


        :param id: The id of this BillType.
        :type id: int
        """

        self._id = id

    @property
    def name(self) -> str:
        """Gets the name of this BillType.


        :return: The name of this BillType.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this BillType.


        :param name: The name of this BillType.
        :type name: str
        """

        self._name = name
