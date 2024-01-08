from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.app_info_update_request_data_relationships_primary_category import AppInfoUpdateRequestDataRelationshipsPrimaryCategory
from openapi_server import util

from openapi_server.models.app_info_update_request_data_relationships_primary_category import AppInfoUpdateRequestDataRelationshipsPrimaryCategory  # noqa: E501

class AppInfoUpdateRequestDataRelationships(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, primary_category=None, primary_subcategory_one=None, primary_subcategory_two=None, secondary_category=None, secondary_subcategory_one=None, secondary_subcategory_two=None):  # noqa: E501
        """AppInfoUpdateRequestDataRelationships - a model defined in OpenAPI

        :param primary_category: The primary_category of this AppInfoUpdateRequestDataRelationships.  # noqa: E501
        :type primary_category: AppInfoUpdateRequestDataRelationshipsPrimaryCategory
        :param primary_subcategory_one: The primary_subcategory_one of this AppInfoUpdateRequestDataRelationships.  # noqa: E501
        :type primary_subcategory_one: AppInfoUpdateRequestDataRelationshipsPrimaryCategory
        :param primary_subcategory_two: The primary_subcategory_two of this AppInfoUpdateRequestDataRelationships.  # noqa: E501
        :type primary_subcategory_two: AppInfoUpdateRequestDataRelationshipsPrimaryCategory
        :param secondary_category: The secondary_category of this AppInfoUpdateRequestDataRelationships.  # noqa: E501
        :type secondary_category: AppInfoUpdateRequestDataRelationshipsPrimaryCategory
        :param secondary_subcategory_one: The secondary_subcategory_one of this AppInfoUpdateRequestDataRelationships.  # noqa: E501
        :type secondary_subcategory_one: AppInfoUpdateRequestDataRelationshipsPrimaryCategory
        :param secondary_subcategory_two: The secondary_subcategory_two of this AppInfoUpdateRequestDataRelationships.  # noqa: E501
        :type secondary_subcategory_two: AppInfoUpdateRequestDataRelationshipsPrimaryCategory
        """
        self.openapi_types = {
            'primary_category': AppInfoUpdateRequestDataRelationshipsPrimaryCategory,
            'primary_subcategory_one': AppInfoUpdateRequestDataRelationshipsPrimaryCategory,
            'primary_subcategory_two': AppInfoUpdateRequestDataRelationshipsPrimaryCategory,
            'secondary_category': AppInfoUpdateRequestDataRelationshipsPrimaryCategory,
            'secondary_subcategory_one': AppInfoUpdateRequestDataRelationshipsPrimaryCategory,
            'secondary_subcategory_two': AppInfoUpdateRequestDataRelationshipsPrimaryCategory
        }

        self.attribute_map = {
            'primary_category': 'primaryCategory',
            'primary_subcategory_one': 'primarySubcategoryOne',
            'primary_subcategory_two': 'primarySubcategoryTwo',
            'secondary_category': 'secondaryCategory',
            'secondary_subcategory_one': 'secondarySubcategoryOne',
            'secondary_subcategory_two': 'secondarySubcategoryTwo'
        }

        self._primary_category = primary_category
        self._primary_subcategory_one = primary_subcategory_one
        self._primary_subcategory_two = primary_subcategory_two
        self._secondary_category = secondary_category
        self._secondary_subcategory_one = secondary_subcategory_one
        self._secondary_subcategory_two = secondary_subcategory_two

    @classmethod
    def from_dict(cls, dikt) -> 'AppInfoUpdateRequestDataRelationships':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The AppInfoUpdateRequest_data_relationships of this AppInfoUpdateRequestDataRelationships.  # noqa: E501
        :rtype: AppInfoUpdateRequestDataRelationships
        """
        return util.deserialize_model(dikt, cls)

    @property
    def primary_category(self) -> AppInfoUpdateRequestDataRelationshipsPrimaryCategory:
        """Gets the primary_category of this AppInfoUpdateRequestDataRelationships.


        :return: The primary_category of this AppInfoUpdateRequestDataRelationships.
        :rtype: AppInfoUpdateRequestDataRelationshipsPrimaryCategory
        """
        return self._primary_category

    @primary_category.setter
    def primary_category(self, primary_category: AppInfoUpdateRequestDataRelationshipsPrimaryCategory):
        """Sets the primary_category of this AppInfoUpdateRequestDataRelationships.


        :param primary_category: The primary_category of this AppInfoUpdateRequestDataRelationships.
        :type primary_category: AppInfoUpdateRequestDataRelationshipsPrimaryCategory
        """

        self._primary_category = primary_category

    @property
    def primary_subcategory_one(self) -> AppInfoUpdateRequestDataRelationshipsPrimaryCategory:
        """Gets the primary_subcategory_one of this AppInfoUpdateRequestDataRelationships.


        :return: The primary_subcategory_one of this AppInfoUpdateRequestDataRelationships.
        :rtype: AppInfoUpdateRequestDataRelationshipsPrimaryCategory
        """
        return self._primary_subcategory_one

    @primary_subcategory_one.setter
    def primary_subcategory_one(self, primary_subcategory_one: AppInfoUpdateRequestDataRelationshipsPrimaryCategory):
        """Sets the primary_subcategory_one of this AppInfoUpdateRequestDataRelationships.


        :param primary_subcategory_one: The primary_subcategory_one of this AppInfoUpdateRequestDataRelationships.
        :type primary_subcategory_one: AppInfoUpdateRequestDataRelationshipsPrimaryCategory
        """

        self._primary_subcategory_one = primary_subcategory_one

    @property
    def primary_subcategory_two(self) -> AppInfoUpdateRequestDataRelationshipsPrimaryCategory:
        """Gets the primary_subcategory_two of this AppInfoUpdateRequestDataRelationships.


        :return: The primary_subcategory_two of this AppInfoUpdateRequestDataRelationships.
        :rtype: AppInfoUpdateRequestDataRelationshipsPrimaryCategory
        """
        return self._primary_subcategory_two

    @primary_subcategory_two.setter
    def primary_subcategory_two(self, primary_subcategory_two: AppInfoUpdateRequestDataRelationshipsPrimaryCategory):
        """Sets the primary_subcategory_two of this AppInfoUpdateRequestDataRelationships.


        :param primary_subcategory_two: The primary_subcategory_two of this AppInfoUpdateRequestDataRelationships.
        :type primary_subcategory_two: AppInfoUpdateRequestDataRelationshipsPrimaryCategory
        """

        self._primary_subcategory_two = primary_subcategory_two

    @property
    def secondary_category(self) -> AppInfoUpdateRequestDataRelationshipsPrimaryCategory:
        """Gets the secondary_category of this AppInfoUpdateRequestDataRelationships.


        :return: The secondary_category of this AppInfoUpdateRequestDataRelationships.
        :rtype: AppInfoUpdateRequestDataRelationshipsPrimaryCategory
        """
        return self._secondary_category

    @secondary_category.setter
    def secondary_category(self, secondary_category: AppInfoUpdateRequestDataRelationshipsPrimaryCategory):
        """Sets the secondary_category of this AppInfoUpdateRequestDataRelationships.


        :param secondary_category: The secondary_category of this AppInfoUpdateRequestDataRelationships.
        :type secondary_category: AppInfoUpdateRequestDataRelationshipsPrimaryCategory
        """

        self._secondary_category = secondary_category

    @property
    def secondary_subcategory_one(self) -> AppInfoUpdateRequestDataRelationshipsPrimaryCategory:
        """Gets the secondary_subcategory_one of this AppInfoUpdateRequestDataRelationships.


        :return: The secondary_subcategory_one of this AppInfoUpdateRequestDataRelationships.
        :rtype: AppInfoUpdateRequestDataRelationshipsPrimaryCategory
        """
        return self._secondary_subcategory_one

    @secondary_subcategory_one.setter
    def secondary_subcategory_one(self, secondary_subcategory_one: AppInfoUpdateRequestDataRelationshipsPrimaryCategory):
        """Sets the secondary_subcategory_one of this AppInfoUpdateRequestDataRelationships.


        :param secondary_subcategory_one: The secondary_subcategory_one of this AppInfoUpdateRequestDataRelationships.
        :type secondary_subcategory_one: AppInfoUpdateRequestDataRelationshipsPrimaryCategory
        """

        self._secondary_subcategory_one = secondary_subcategory_one

    @property
    def secondary_subcategory_two(self) -> AppInfoUpdateRequestDataRelationshipsPrimaryCategory:
        """Gets the secondary_subcategory_two of this AppInfoUpdateRequestDataRelationships.


        :return: The secondary_subcategory_two of this AppInfoUpdateRequestDataRelationships.
        :rtype: AppInfoUpdateRequestDataRelationshipsPrimaryCategory
        """
        return self._secondary_subcategory_two

    @secondary_subcategory_two.setter
    def secondary_subcategory_two(self, secondary_subcategory_two: AppInfoUpdateRequestDataRelationshipsPrimaryCategory):
        """Sets the secondary_subcategory_two of this AppInfoUpdateRequestDataRelationships.


        :param secondary_subcategory_two: The secondary_subcategory_two of this AppInfoUpdateRequestDataRelationships.
        :type secondary_subcategory_two: AppInfoUpdateRequestDataRelationshipsPrimaryCategory
        """

        self._secondary_subcategory_two = secondary_subcategory_two
