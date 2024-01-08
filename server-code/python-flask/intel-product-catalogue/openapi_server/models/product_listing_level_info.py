from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.product_listing_level_info_result_inner import ProductListingLevelInfoResultInner
from openapi_server import util

from openapi_server.models.product_listing_level_info_result_inner import ProductListingLevelInfoResultInner  # noqa: E501

class ProductListingLevelInfo(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, page_no=None, per_page=None, result=None, status=None, total_count=None):  # noqa: E501
        """ProductListingLevelInfo - a model defined in OpenAPI

        :param page_no: The page_no of this ProductListingLevelInfo.  # noqa: E501
        :type page_no: str
        :param per_page: The per_page of this ProductListingLevelInfo.  # noqa: E501
        :type per_page: int
        :param result: The result of this ProductListingLevelInfo.  # noqa: E501
        :type result: List[ProductListingLevelInfoResultInner]
        :param status: The status of this ProductListingLevelInfo.  # noqa: E501
        :type status: str
        :param total_count: The total_count of this ProductListingLevelInfo.  # noqa: E501
        :type total_count: int
        """
        self.openapi_types = {
            'page_no': str,
            'per_page': int,
            'result': List[ProductListingLevelInfoResultInner],
            'status': str,
            'total_count': int
        }

        self.attribute_map = {
            'page_no': 'page_no',
            'per_page': 'per_page',
            'result': 'result',
            'status': 'status',
            'total_count': 'total_count'
        }

        self._page_no = page_no
        self._per_page = per_page
        self._result = result
        self._status = status
        self._total_count = total_count

    @classmethod
    def from_dict(cls, dikt) -> 'ProductListingLevelInfo':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The Product_listing_level_info of this ProductListingLevelInfo.  # noqa: E501
        :rtype: ProductListingLevelInfo
        """
        return util.deserialize_model(dikt, cls)

    @property
    def page_no(self) -> str:
        """Gets the page_no of this ProductListingLevelInfo.


        :return: The page_no of this ProductListingLevelInfo.
        :rtype: str
        """
        return self._page_no

    @page_no.setter
    def page_no(self, page_no: str):
        """Sets the page_no of this ProductListingLevelInfo.


        :param page_no: The page_no of this ProductListingLevelInfo.
        :type page_no: str
        """
        if page_no is None:
            raise ValueError("Invalid value for `page_no`, must not be `None`")  # noqa: E501

        self._page_no = page_no

    @property
    def per_page(self) -> int:
        """Gets the per_page of this ProductListingLevelInfo.


        :return: The per_page of this ProductListingLevelInfo.
        :rtype: int
        """
        return self._per_page

    @per_page.setter
    def per_page(self, per_page: int):
        """Sets the per_page of this ProductListingLevelInfo.


        :param per_page: The per_page of this ProductListingLevelInfo.
        :type per_page: int
        """
        if per_page is None:
            raise ValueError("Invalid value for `per_page`, must not be `None`")  # noqa: E501

        self._per_page = per_page

    @property
    def result(self) -> List[ProductListingLevelInfoResultInner]:
        """Gets the result of this ProductListingLevelInfo.

        Multiple objects with product data.  # noqa: E501

        :return: The result of this ProductListingLevelInfo.
        :rtype: List[ProductListingLevelInfoResultInner]
        """
        return self._result

    @result.setter
    def result(self, result: List[ProductListingLevelInfoResultInner]):
        """Sets the result of this ProductListingLevelInfo.

        Multiple objects with product data.  # noqa: E501

        :param result: The result of this ProductListingLevelInfo.
        :type result: List[ProductListingLevelInfoResultInner]
        """
        if result is None:
            raise ValueError("Invalid value for `result`, must not be `None`")  # noqa: E501

        self._result = result

    @property
    def status(self) -> str:
        """Gets the status of this ProductListingLevelInfo.


        :return: The status of this ProductListingLevelInfo.
        :rtype: str
        """
        return self._status

    @status.setter
    def status(self, status: str):
        """Sets the status of this ProductListingLevelInfo.


        :param status: The status of this ProductListingLevelInfo.
        :type status: str
        """
        if status is None:
            raise ValueError("Invalid value for `status`, must not be `None`")  # noqa: E501

        self._status = status

    @property
    def total_count(self) -> int:
        """Gets the total_count of this ProductListingLevelInfo.


        :return: The total_count of this ProductListingLevelInfo.
        :rtype: int
        """
        return self._total_count

    @total_count.setter
    def total_count(self, total_count: int):
        """Sets the total_count of this ProductListingLevelInfo.


        :param total_count: The total_count of this ProductListingLevelInfo.
        :type total_count: int
        """
        if total_count is None:
            raise ValueError("Invalid value for `total_count`, must not be `None`")  # noqa: E501

        self._total_count = total_count