from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class DetailedProductInformationResultInnerAllOfReferenceInner(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, category_id=None, reference_id=None, reference_type=None):  # noqa: E501
        """DetailedProductInformationResultInnerAllOfReferenceInner - a model defined in OpenAPI

        :param category_id: The category_id of this DetailedProductInformationResultInnerAllOfReferenceInner.  # noqa: E501
        :type category_id: List[str]
        :param reference_id: The reference_id of this DetailedProductInformationResultInnerAllOfReferenceInner.  # noqa: E501
        :type reference_id: str
        :param reference_type: The reference_type of this DetailedProductInformationResultInnerAllOfReferenceInner.  # noqa: E501
        :type reference_type: str
        """
        self.openapi_types = {
            'category_id': List[str],
            'reference_id': str,
            'reference_type': str
        }

        self.attribute_map = {
            'category_id': 'category_id',
            'reference_id': 'reference_id',
            'reference_type': 'reference_type'
        }

        self._category_id = category_id
        self._reference_id = reference_id
        self._reference_type = reference_type

    @classmethod
    def from_dict(cls, dikt) -> 'DetailedProductInformationResultInnerAllOfReferenceInner':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Detailed_product_information_result_inner_allOf_reference_inner of this DetailedProductInformationResultInnerAllOfReferenceInner.  # noqa: E501
        :rtype: DetailedProductInformationResultInnerAllOfReferenceInner
        """
        return util.deserialize_model(dikt, cls)

    @property
    def category_id(self) -> List[str]:
        """Gets the category_id of this DetailedProductInformationResultInnerAllOfReferenceInner.

        Array of category id's to which the product belong to.  # noqa: E501

        :return: The category_id of this DetailedProductInformationResultInnerAllOfReferenceInner.
        :rtype: List[str]
        """
        return self._category_id

    @category_id.setter
    def category_id(self, category_id: List[str]):
        """Sets the category_id of this DetailedProductInformationResultInnerAllOfReferenceInner.

        Array of category id's to which the product belong to.  # noqa: E501

        :param category_id: The category_id of this DetailedProductInformationResultInnerAllOfReferenceInner.
        :type category_id: List[str]
        """

        self._category_id = category_id

    @property
    def reference_id(self) -> str:
        """Gets the reference_id of this DetailedProductInformationResultInnerAllOfReferenceInner.


        :return: The reference_id of this DetailedProductInformationResultInnerAllOfReferenceInner.
        :rtype: str
        """
        return self._reference_id

    @reference_id.setter
    def reference_id(self, reference_id: str):
        """Sets the reference_id of this DetailedProductInformationResultInnerAllOfReferenceInner.


        :param reference_id: The reference_id of this DetailedProductInformationResultInnerAllOfReferenceInner.
        :type reference_id: str
        """

        self._reference_id = reference_id

    @property
    def reference_type(self) -> str:
        """Gets the reference_type of this DetailedProductInformationResultInnerAllOfReferenceInner.


        :return: The reference_type of this DetailedProductInformationResultInnerAllOfReferenceInner.
        :rtype: str
        """
        return self._reference_type

    @reference_type.setter
    def reference_type(self, reference_type: str):
        """Sets the reference_type of this DetailedProductInformationResultInnerAllOfReferenceInner.


        :param reference_type: The reference_type of this DetailedProductInformationResultInnerAllOfReferenceInner.
        :type reference_type: str
        """

        self._reference_type = reference_type
