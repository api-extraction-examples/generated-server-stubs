from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.detailed_product_information_result_inner_all_of_media_asset import DetailedProductInformationResultInnerAllOfMediaAsset
from openapi_server.models.detailed_product_information_result_inner_all_of_reference_inner import DetailedProductInformationResultInnerAllOfReferenceInner
from openapi_server.models.detailed_product_information_result_inner_all_of_tech_spec_inner import DetailedProductInformationResultInnerAllOfTechSpecInner
from openapi_server import util

from openapi_server.models.detailed_product_information_result_inner_all_of_media_asset import DetailedProductInformationResultInnerAllOfMediaAsset  # noqa: E501
from openapi_server.models.detailed_product_information_result_inner_all_of_reference_inner import DetailedProductInformationResultInnerAllOfReferenceInner  # noqa: E501
from openapi_server.models.detailed_product_information_result_inner_all_of_tech_spec_inner import DetailedProductInformationResultInnerAllOfTechSpecInner  # noqa: E501

class DetailedProductInformationResultInner(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, created_date=None, media_asset=None, mktg_prd_type=None, product_category=None, product_description=None, product_id=None, product_manufacturer=None, product_name=None, product_name_raw=None, product_on_market_date=None, product_picture=None, reference=None, tech_spec=None, updated_date=None):  # noqa: E501
        """DetailedProductInformationResultInner - a model defined in OpenAPI

        :param created_date: The created_date of this DetailedProductInformationResultInner.  # noqa: E501
        :type created_date: str
        :param media_asset: The media_asset of this DetailedProductInformationResultInner.  # noqa: E501
        :type media_asset: DetailedProductInformationResultInnerAllOfMediaAsset
        :param mktg_prd_type: The mktg_prd_type of this DetailedProductInformationResultInner.  # noqa: E501
        :type mktg_prd_type: str
        :param product_category: The product_category of this DetailedProductInformationResultInner.  # noqa: E501
        :type product_category: List[str]
        :param product_description: The product_description of this DetailedProductInformationResultInner.  # noqa: E501
        :type product_description: str
        :param product_id: The product_id of this DetailedProductInformationResultInner.  # noqa: E501
        :type product_id: str
        :param product_manufacturer: The product_manufacturer of this DetailedProductInformationResultInner.  # noqa: E501
        :type product_manufacturer: str
        :param product_name: The product_name of this DetailedProductInformationResultInner.  # noqa: E501
        :type product_name: str
        :param product_name_raw: The product_name_raw of this DetailedProductInformationResultInner.  # noqa: E501
        :type product_name_raw: str
        :param product_on_market_date: The product_on_market_date of this DetailedProductInformationResultInner.  # noqa: E501
        :type product_on_market_date: str
        :param product_picture: The product_picture of this DetailedProductInformationResultInner.  # noqa: E501
        :type product_picture: str
        :param reference: The reference of this DetailedProductInformationResultInner.  # noqa: E501
        :type reference: List[DetailedProductInformationResultInnerAllOfReferenceInner]
        :param tech_spec: The tech_spec of this DetailedProductInformationResultInner.  # noqa: E501
        :type tech_spec: List[DetailedProductInformationResultInnerAllOfTechSpecInner]
        :param updated_date: The updated_date of this DetailedProductInformationResultInner.  # noqa: E501
        :type updated_date: str
        """
        self.openapi_types = {
            'created_date': str,
            'media_asset': DetailedProductInformationResultInnerAllOfMediaAsset,
            'mktg_prd_type': str,
            'product_category': List[str],
            'product_description': str,
            'product_id': str,
            'product_manufacturer': str,
            'product_name': str,
            'product_name_raw': str,
            'product_on_market_date': str,
            'product_picture': str,
            'reference': List[DetailedProductInformationResultInnerAllOfReferenceInner],
            'tech_spec': List[DetailedProductInformationResultInnerAllOfTechSpecInner],
            'updated_date': str
        }

        self.attribute_map = {
            'created_date': 'created_date',
            'media_asset': 'media_asset',
            'mktg_prd_type': 'mktg_prd_type',
            'product_category': 'product_category',
            'product_description': 'product_description',
            'product_id': 'product_id',
            'product_manufacturer': 'product_manufacturer',
            'product_name': 'product_name',
            'product_name_raw': 'product_name_raw',
            'product_on_market_date': 'product_on_market_date',
            'product_picture': 'product_picture',
            'reference': 'reference',
            'tech_spec': 'tech_spec',
            'updated_date': 'updated_date'
        }

        self._created_date = created_date
        self._media_asset = media_asset
        self._mktg_prd_type = mktg_prd_type
        self._product_category = product_category
        self._product_description = product_description
        self._product_id = product_id
        self._product_manufacturer = product_manufacturer
        self._product_name = product_name
        self._product_name_raw = product_name_raw
        self._product_on_market_date = product_on_market_date
        self._product_picture = product_picture
        self._reference = reference
        self._tech_spec = tech_spec
        self._updated_date = updated_date

    @classmethod
    def from_dict(cls, dikt) -> 'DetailedProductInformationResultInner':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Detailed_product_information_result_inner of this DetailedProductInformationResultInner.  # noqa: E501
        :rtype: DetailedProductInformationResultInner
        """
        return util.deserialize_model(dikt, cls)

    @property
    def created_date(self) -> str:
        """Gets the created_date of this DetailedProductInformationResultInner.


        :return: The created_date of this DetailedProductInformationResultInner.
        :rtype: str
        """
        return self._created_date

    @created_date.setter
    def created_date(self, created_date: str):
        """Sets the created_date of this DetailedProductInformationResultInner.


        :param created_date: The created_date of this DetailedProductInformationResultInner.
        :type created_date: str
        """

        self._created_date = created_date

    @property
    def media_asset(self) -> DetailedProductInformationResultInnerAllOfMediaAsset:
        """Gets the media_asset of this DetailedProductInformationResultInner.


        :return: The media_asset of this DetailedProductInformationResultInner.
        :rtype: DetailedProductInformationResultInnerAllOfMediaAsset
        """
        return self._media_asset

    @media_asset.setter
    def media_asset(self, media_asset: DetailedProductInformationResultInnerAllOfMediaAsset):
        """Sets the media_asset of this DetailedProductInformationResultInner.


        :param media_asset: The media_asset of this DetailedProductInformationResultInner.
        :type media_asset: DetailedProductInformationResultInnerAllOfMediaAsset
        """

        self._media_asset = media_asset

    @property
    def mktg_prd_type(self) -> str:
        """Gets the mktg_prd_type of this DetailedProductInformationResultInner.


        :return: The mktg_prd_type of this DetailedProductInformationResultInner.
        :rtype: str
        """
        return self._mktg_prd_type

    @mktg_prd_type.setter
    def mktg_prd_type(self, mktg_prd_type: str):
        """Sets the mktg_prd_type of this DetailedProductInformationResultInner.


        :param mktg_prd_type: The mktg_prd_type of this DetailedProductInformationResultInner.
        :type mktg_prd_type: str
        """

        self._mktg_prd_type = mktg_prd_type

    @property
    def product_category(self) -> List[str]:
        """Gets the product_category of this DetailedProductInformationResultInner.

        Product category  # noqa: E501

        :return: The product_category of this DetailedProductInformationResultInner.
        :rtype: List[str]
        """
        return self._product_category

    @product_category.setter
    def product_category(self, product_category: List[str]):
        """Sets the product_category of this DetailedProductInformationResultInner.

        Product category  # noqa: E501

        :param product_category: The product_category of this DetailedProductInformationResultInner.
        :type product_category: List[str]
        """

        self._product_category = product_category

    @property
    def product_description(self) -> str:
        """Gets the product_description of this DetailedProductInformationResultInner.


        :return: The product_description of this DetailedProductInformationResultInner.
        :rtype: str
        """
        return self._product_description

    @product_description.setter
    def product_description(self, product_description: str):
        """Sets the product_description of this DetailedProductInformationResultInner.


        :param product_description: The product_description of this DetailedProductInformationResultInner.
        :type product_description: str
        """

        self._product_description = product_description

    @property
    def product_id(self) -> str:
        """Gets the product_id of this DetailedProductInformationResultInner.


        :return: The product_id of this DetailedProductInformationResultInner.
        :rtype: str
        """
        return self._product_id

    @product_id.setter
    def product_id(self, product_id: str):
        """Sets the product_id of this DetailedProductInformationResultInner.


        :param product_id: The product_id of this DetailedProductInformationResultInner.
        :type product_id: str
        """

        self._product_id = product_id

    @property
    def product_manufacturer(self) -> str:
        """Gets the product_manufacturer of this DetailedProductInformationResultInner.


        :return: The product_manufacturer of this DetailedProductInformationResultInner.
        :rtype: str
        """
        return self._product_manufacturer

    @product_manufacturer.setter
    def product_manufacturer(self, product_manufacturer: str):
        """Sets the product_manufacturer of this DetailedProductInformationResultInner.


        :param product_manufacturer: The product_manufacturer of this DetailedProductInformationResultInner.
        :type product_manufacturer: str
        """

        self._product_manufacturer = product_manufacturer

    @property
    def product_name(self) -> str:
        """Gets the product_name of this DetailedProductInformationResultInner.


        :return: The product_name of this DetailedProductInformationResultInner.
        :rtype: str
        """
        return self._product_name

    @product_name.setter
    def product_name(self, product_name: str):
        """Sets the product_name of this DetailedProductInformationResultInner.


        :param product_name: The product_name of this DetailedProductInformationResultInner.
        :type product_name: str
        """

        self._product_name = product_name

    @property
    def product_name_raw(self) -> str:
        """Gets the product_name_raw of this DetailedProductInformationResultInner.


        :return: The product_name_raw of this DetailedProductInformationResultInner.
        :rtype: str
        """
        return self._product_name_raw

    @product_name_raw.setter
    def product_name_raw(self, product_name_raw: str):
        """Sets the product_name_raw of this DetailedProductInformationResultInner.


        :param product_name_raw: The product_name_raw of this DetailedProductInformationResultInner.
        :type product_name_raw: str
        """

        self._product_name_raw = product_name_raw

    @property
    def product_on_market_date(self) -> str:
        """Gets the product_on_market_date of this DetailedProductInformationResultInner.


        :return: The product_on_market_date of this DetailedProductInformationResultInner.
        :rtype: str
        """
        return self._product_on_market_date

    @product_on_market_date.setter
    def product_on_market_date(self, product_on_market_date: str):
        """Sets the product_on_market_date of this DetailedProductInformationResultInner.


        :param product_on_market_date: The product_on_market_date of this DetailedProductInformationResultInner.
        :type product_on_market_date: str
        """

        self._product_on_market_date = product_on_market_date

    @property
    def product_picture(self) -> str:
        """Gets the product_picture of this DetailedProductInformationResultInner.


        :return: The product_picture of this DetailedProductInformationResultInner.
        :rtype: str
        """
        return self._product_picture

    @product_picture.setter
    def product_picture(self, product_picture: str):
        """Sets the product_picture of this DetailedProductInformationResultInner.


        :param product_picture: The product_picture of this DetailedProductInformationResultInner.
        :type product_picture: str
        """

        self._product_picture = product_picture

    @property
    def reference(self) -> List[DetailedProductInformationResultInnerAllOfReferenceInner]:
        """Gets the reference of this DetailedProductInformationResultInner.


        :return: The reference of this DetailedProductInformationResultInner.
        :rtype: List[DetailedProductInformationResultInnerAllOfReferenceInner]
        """
        return self._reference

    @reference.setter
    def reference(self, reference: List[DetailedProductInformationResultInnerAllOfReferenceInner]):
        """Sets the reference of this DetailedProductInformationResultInner.


        :param reference: The reference of this DetailedProductInformationResultInner.
        :type reference: List[DetailedProductInformationResultInnerAllOfReferenceInner]
        """

        self._reference = reference

    @property
    def tech_spec(self) -> List[DetailedProductInformationResultInnerAllOfTechSpecInner]:
        """Gets the tech_spec of this DetailedProductInformationResultInner.

        tech spec  # noqa: E501

        :return: The tech_spec of this DetailedProductInformationResultInner.
        :rtype: List[DetailedProductInformationResultInnerAllOfTechSpecInner]
        """
        return self._tech_spec

    @tech_spec.setter
    def tech_spec(self, tech_spec: List[DetailedProductInformationResultInnerAllOfTechSpecInner]):
        """Sets the tech_spec of this DetailedProductInformationResultInner.

        tech spec  # noqa: E501

        :param tech_spec: The tech_spec of this DetailedProductInformationResultInner.
        :type tech_spec: List[DetailedProductInformationResultInnerAllOfTechSpecInner]
        """

        self._tech_spec = tech_spec

    @property
    def updated_date(self) -> str:
        """Gets the updated_date of this DetailedProductInformationResultInner.


        :return: The updated_date of this DetailedProductInformationResultInner.
        :rtype: str
        """
        return self._updated_date

    @updated_date.setter
    def updated_date(self, updated_date: str):
        """Sets the updated_date of this DetailedProductInformationResultInner.


        :param updated_date: The updated_date of this DetailedProductInformationResultInner.
        :type updated_date: str
        """

        self._updated_date = updated_date
