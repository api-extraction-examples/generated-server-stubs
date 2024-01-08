from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server import util


class InAppPurchaseAttributes(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, in_app_purchase_type=None, product_id=None, reference_name=None, state=None):  # noqa: E501
        """InAppPurchaseAttributes - a model defined in OpenAPI

        :param in_app_purchase_type: The in_app_purchase_type of this InAppPurchaseAttributes.  # noqa: E501
        :type in_app_purchase_type: str
        :param product_id: The product_id of this InAppPurchaseAttributes.  # noqa: E501
        :type product_id: str
        :param reference_name: The reference_name of this InAppPurchaseAttributes.  # noqa: E501
        :type reference_name: str
        :param state: The state of this InAppPurchaseAttributes.  # noqa: E501
        :type state: str
        """
        self.openapi_types = {
            'in_app_purchase_type': str,
            'product_id': str,
            'reference_name': str,
            'state': str
        }

        self.attribute_map = {
            'in_app_purchase_type': 'inAppPurchaseType',
            'product_id': 'productId',
            'reference_name': 'referenceName',
            'state': 'state'
        }

        self._in_app_purchase_type = in_app_purchase_type
        self._product_id = product_id
        self._reference_name = reference_name
        self._state = state

    @classmethod
    def from_dict(cls, dikt) -> 'InAppPurchaseAttributes':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The InAppPurchase_attributes of this InAppPurchaseAttributes.  # noqa: E501
        :rtype: InAppPurchaseAttributes
        """
        return util.deserialize_model(dikt, cls)

    @property
    def in_app_purchase_type(self) -> str:
        """Gets the in_app_purchase_type of this InAppPurchaseAttributes.


        :return: The in_app_purchase_type of this InAppPurchaseAttributes.
        :rtype: str
        """
        return self._in_app_purchase_type

    @in_app_purchase_type.setter
    def in_app_purchase_type(self, in_app_purchase_type: str):
        """Sets the in_app_purchase_type of this InAppPurchaseAttributes.


        :param in_app_purchase_type: The in_app_purchase_type of this InAppPurchaseAttributes.
        :type in_app_purchase_type: str
        """
        allowed_values = ["AUTOMATICALLY_RENEWABLE_SUBSCRIPTION", "NON_CONSUMABLE", "CONSUMABLE", "NON_RENEWING_SUBSCRIPTION", "FREE_SUBSCRIPTION"]  # noqa: E501
        if in_app_purchase_type not in allowed_values:
            raise ValueError(
                "Invalid value for `in_app_purchase_type` ({0}), must be one of {1}"
                .format(in_app_purchase_type, allowed_values)
            )

        self._in_app_purchase_type = in_app_purchase_type

    @property
    def product_id(self) -> str:
        """Gets the product_id of this InAppPurchaseAttributes.


        :return: The product_id of this InAppPurchaseAttributes.
        :rtype: str
        """
        return self._product_id

    @product_id.setter
    def product_id(self, product_id: str):
        """Sets the product_id of this InAppPurchaseAttributes.


        :param product_id: The product_id of this InAppPurchaseAttributes.
        :type product_id: str
        """

        self._product_id = product_id

    @property
    def reference_name(self) -> str:
        """Gets the reference_name of this InAppPurchaseAttributes.


        :return: The reference_name of this InAppPurchaseAttributes.
        :rtype: str
        """
        return self._reference_name

    @reference_name.setter
    def reference_name(self, reference_name: str):
        """Sets the reference_name of this InAppPurchaseAttributes.


        :param reference_name: The reference_name of this InAppPurchaseAttributes.
        :type reference_name: str
        """

        self._reference_name = reference_name

    @property
    def state(self) -> str:
        """Gets the state of this InAppPurchaseAttributes.


        :return: The state of this InAppPurchaseAttributes.
        :rtype: str
        """
        return self._state

    @state.setter
    def state(self, state: str):
        """Sets the state of this InAppPurchaseAttributes.


        :param state: The state of this InAppPurchaseAttributes.
        :type state: str
        """
        allowed_values = ["CREATED", "DEVELOPER_SIGNED_OFF", "DEVELOPER_ACTION_NEEDED", "DELETION_IN_PROGRESS", "APPROVED", "DELETED", "REMOVED_FROM_SALE", "DEVELOPER_REMOVED_FROM_SALE", "WAITING_FOR_UPLOAD", "PROCESSING_CONTENT", "REPLACED", "REJECTED", "WAITING_FOR_SCREENSHOT", "PREPARE_FOR_SUBMISSION", "MISSING_METADATA", "READY_TO_SUBMIT", "WAITING_FOR_REVIEW", "IN_REVIEW", "PENDING_DEVELOPER_RELEASE"]  # noqa: E501
        if state not in allowed_values:
            raise ValueError(
                "Invalid value for `state` ({0}), must be one of {1}"
                .format(state, allowed_values)
            )

        self._state = state
