from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.jql_query_clause import JqlQueryClause
from openapi_server.models.jql_query_order_by_clause import JqlQueryOrderByClause
from openapi_server import util

from openapi_server.models.jql_query_clause import JqlQueryClause  # noqa: E501
from openapi_server.models.jql_query_order_by_clause import JqlQueryOrderByClause  # noqa: E501

class JqlQuery(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, order_by=None, where=None):  # noqa: E501
        """JqlQuery - a model defined in OpenAPI

        :param order_by: The order_by of this JqlQuery.  # noqa: E501
        :type order_by: JqlQueryOrderByClause
        :param where: The where of this JqlQuery.  # noqa: E501
        :type where: JqlQueryClause
        """
        self.openapi_types = {
            'order_by': JqlQueryOrderByClause,
            'where': JqlQueryClause
        }

        self.attribute_map = {
            'order_by': 'orderBy',
            'where': 'where'
        }

        self._order_by = order_by
        self._where = where

    @classmethod
    def from_dict(cls, dikt) -> 'JqlQuery':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The JqlQuery of this JqlQuery.  # noqa: E501
        :rtype: JqlQuery
        """
        return util.deserialize_model(dikt, cls)

    @property
    def order_by(self) -> JqlQueryOrderByClause:
        """Gets the order_by of this JqlQuery.


        :return: The order_by of this JqlQuery.
        :rtype: JqlQueryOrderByClause
        """
        return self._order_by

    @order_by.setter
    def order_by(self, order_by: JqlQueryOrderByClause):
        """Sets the order_by of this JqlQuery.


        :param order_by: The order_by of this JqlQuery.
        :type order_by: JqlQueryOrderByClause
        """

        self._order_by = order_by

    @property
    def where(self) -> JqlQueryClause:
        """Gets the where of this JqlQuery.


        :return: The where of this JqlQuery.
        :rtype: JqlQueryClause
        """
        return self._where

    @where.setter
    def where(self, where: JqlQueryClause):
        """Sets the where of this JqlQuery.


        :param where: The where of this JqlQuery.
        :type where: JqlQueryClause
        """

        self._where = where