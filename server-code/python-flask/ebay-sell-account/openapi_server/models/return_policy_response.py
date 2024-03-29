from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.return_policy import ReturnPolicy
from openapi_server import util

from openapi_server.models.return_policy import ReturnPolicy  # noqa: E501

class ReturnPolicyResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, href=None, limit=None, next=None, offset=None, prev=None, return_policies=None, total=None):  # noqa: E501
        """ReturnPolicyResponse - a model defined in OpenAPI

        :param href: The href of this ReturnPolicyResponse.  # noqa: E501
        :type href: str
        :param limit: The limit of this ReturnPolicyResponse.  # noqa: E501
        :type limit: int
        :param next: The next of this ReturnPolicyResponse.  # noqa: E501
        :type next: str
        :param offset: The offset of this ReturnPolicyResponse.  # noqa: E501
        :type offset: int
        :param prev: The prev of this ReturnPolicyResponse.  # noqa: E501
        :type prev: str
        :param return_policies: The return_policies of this ReturnPolicyResponse.  # noqa: E501
        :type return_policies: List[ReturnPolicy]
        :param total: The total of this ReturnPolicyResponse.  # noqa: E501
        :type total: int
        """
        self.openapi_types = {
            'href': str,
            'limit': int,
            'next': str,
            'offset': int,
            'prev': str,
            'return_policies': List[ReturnPolicy],
            'total': int
        }

        self.attribute_map = {
            'href': 'href',
            'limit': 'limit',
            'next': 'next',
            'offset': 'offset',
            'prev': 'prev',
            'return_policies': 'returnPolicies',
            'total': 'total'
        }

        self._href = href
        self._limit = limit
        self._next = next
        self._offset = offset
        self._prev = prev
        self._return_policies = return_policies
        self._total = total

    @classmethod
    def from_dict(cls, dikt) -> 'ReturnPolicyResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The ReturnPolicyResponse of this ReturnPolicyResponse.  # noqa: E501
        :rtype: ReturnPolicyResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def href(self) -> str:
        """Gets the href of this ReturnPolicyResponse.

        This field is for future use.  # noqa: E501

        :return: The href of this ReturnPolicyResponse.
        :rtype: str
        """
        return self._href

    @href.setter
    def href(self, href: str):
        """Sets the href of this ReturnPolicyResponse.

        This field is for future use.  # noqa: E501

        :param href: The href of this ReturnPolicyResponse.
        :type href: str
        """

        self._href = href

    @property
    def limit(self) -> int:
        """Gets the limit of this ReturnPolicyResponse.

        This field is for future use.  # noqa: E501

        :return: The limit of this ReturnPolicyResponse.
        :rtype: int
        """
        return self._limit

    @limit.setter
    def limit(self, limit: int):
        """Sets the limit of this ReturnPolicyResponse.

        This field is for future use.  # noqa: E501

        :param limit: The limit of this ReturnPolicyResponse.
        :type limit: int
        """

        self._limit = limit

    @property
    def next(self) -> str:
        """Gets the next of this ReturnPolicyResponse.

        This field is for future use.  # noqa: E501

        :return: The next of this ReturnPolicyResponse.
        :rtype: str
        """
        return self._next

    @next.setter
    def next(self, next: str):
        """Sets the next of this ReturnPolicyResponse.

        This field is for future use.  # noqa: E501

        :param next: The next of this ReturnPolicyResponse.
        :type next: str
        """

        self._next = next

    @property
    def offset(self) -> int:
        """Gets the offset of this ReturnPolicyResponse.

        This field is for future use.  # noqa: E501

        :return: The offset of this ReturnPolicyResponse.
        :rtype: int
        """
        return self._offset

    @offset.setter
    def offset(self, offset: int):
        """Sets the offset of this ReturnPolicyResponse.

        This field is for future use.  # noqa: E501

        :param offset: The offset of this ReturnPolicyResponse.
        :type offset: int
        """

        self._offset = offset

    @property
    def prev(self) -> str:
        """Gets the prev of this ReturnPolicyResponse.

        This field is for future use.  # noqa: E501

        :return: The prev of this ReturnPolicyResponse.
        :rtype: str
        """
        return self._prev

    @prev.setter
    def prev(self, prev: str):
        """Sets the prev of this ReturnPolicyResponse.

        This field is for future use.  # noqa: E501

        :param prev: The prev of this ReturnPolicyResponse.
        :type prev: str
        """

        self._prev = prev

    @property
    def return_policies(self) -> List[ReturnPolicy]:
        """Gets the return_policies of this ReturnPolicyResponse.

        A list of all of the seller's return business policies defined for the specified marketplace. This array will be returned as empty if no return business policies are defined for the specified marketplace.  # noqa: E501

        :return: The return_policies of this ReturnPolicyResponse.
        :rtype: List[ReturnPolicy]
        """
        return self._return_policies

    @return_policies.setter
    def return_policies(self, return_policies: List[ReturnPolicy]):
        """Sets the return_policies of this ReturnPolicyResponse.

        A list of all of the seller's return business policies defined for the specified marketplace. This array will be returned as empty if no return business policies are defined for the specified marketplace.  # noqa: E501

        :param return_policies: The return_policies of this ReturnPolicyResponse.
        :type return_policies: List[ReturnPolicy]
        """

        self._return_policies = return_policies

    @property
    def total(self) -> int:
        """Gets the total of this ReturnPolicyResponse.

        The total number of return business policies retrieved in the result set.  <br/><br/>If no return business policies are defined for the specified marketplace, this field is returned with a value of <code>0</code>.  # noqa: E501

        :return: The total of this ReturnPolicyResponse.
        :rtype: int
        """
        return self._total

    @total.setter
    def total(self, total: int):
        """Sets the total of this ReturnPolicyResponse.

        The total number of return business policies retrieved in the result set.  <br/><br/>If no return business policies are defined for the specified marketplace, this field is returned with a value of <code>0</code>.  # noqa: E501

        :param total: The total of this ReturnPolicyResponse.
        :type total: int
        """

        self._total = total
