import connexion
from typing import Dict
from typing import Tuple
from typing import Union

from openapi_server.models.app_categories_response import AppCategoriesResponse  # noqa: E501
from openapi_server.models.app_category_response import AppCategoryResponse  # noqa: E501
from openapi_server.models.error_response import ErrorResponse  # noqa: E501
from openapi_server import util


def app_categories_get_collection(filter_platforms=None, exists_parent=None, fields_app_categories=None, limit=None, include=None, limit_subcategories=None):  # noqa: E501
    """app_categories_get_collection

     # noqa: E501

    :param filter_platforms: filter by attribute &#39;platforms&#39;
    :type filter_platforms: List[str]
    :param exists_parent: filter by existence or non-existence of related &#39;parent&#39;
    :type exists_parent: List[str]
    :param fields_app_categories: the fields to include for returned resources of type appCategories
    :type fields_app_categories: List[str]
    :param limit: maximum resources per page
    :type limit: int
    :param include: comma-separated list of relationships to include
    :type include: List[str]
    :param limit_subcategories: maximum number of related subcategories returned (when they are included)
    :type limit_subcategories: int

    :rtype: Union[AppCategoriesResponse, Tuple[AppCategoriesResponse, int], Tuple[AppCategoriesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def app_categories_get_instance(id, fields_app_categories=None, include=None, limit_subcategories=None):  # noqa: E501
    """app_categories_get_instance

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_app_categories: the fields to include for returned resources of type appCategories
    :type fields_app_categories: List[str]
    :param include: comma-separated list of relationships to include
    :type include: List[str]
    :param limit_subcategories: maximum number of related subcategories returned (when they are included)
    :type limit_subcategories: int

    :rtype: Union[AppCategoryResponse, Tuple[AppCategoryResponse, int], Tuple[AppCategoryResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def app_categories_parent_get_to_one_related(id, fields_app_categories=None):  # noqa: E501
    """app_categories_parent_get_to_one_related

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_app_categories: the fields to include for returned resources of type appCategories
    :type fields_app_categories: List[str]

    :rtype: Union[AppCategoryResponse, Tuple[AppCategoryResponse, int], Tuple[AppCategoryResponse, int, Dict[str, str]]
    """
    return 'do some magic!'


def app_categories_subcategories_get_to_many_related(id, fields_app_categories=None, limit=None):  # noqa: E501
    """app_categories_subcategories_get_to_many_related

     # noqa: E501

    :param id: the id of the requested resource
    :type id: str
    :param fields_app_categories: the fields to include for returned resources of type appCategories
    :type fields_app_categories: List[str]
    :param limit: maximum resources per page
    :type limit: int

    :rtype: Union[AppCategoriesResponse, Tuple[AppCategoriesResponse, int], Tuple[AppCategoriesResponse, int, Dict[str, str]]
    """
    return 'do some magic!'
