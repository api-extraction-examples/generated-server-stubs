from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.category_type import CategoryType
from openapi_server.models.deposit import Deposit
from openapi_server.models.error import Error
from openapi_server.models.payment_method import PaymentMethod
from openapi_server.models.time_duration import TimeDuration
from openapi_server import util

from openapi_server.models.category_type import CategoryType  # noqa: E501
from openapi_server.models.deposit import Deposit  # noqa: E501
from openapi_server.models.error import Error  # noqa: E501
from openapi_server.models.payment_method import PaymentMethod  # noqa: E501
from openapi_server.models.time_duration import TimeDuration  # noqa: E501

class SetPaymentPolicyResponse(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, category_types=None, deposit=None, description=None, full_payment_due_in=None, immediate_pay=None, marketplace_id=None, name=None, payment_instructions=None, payment_methods=None, payment_policy_id=None, warnings=None):  # noqa: E501
        """SetPaymentPolicyResponse - a model defined in OpenAPI

        :param category_types: The category_types of this SetPaymentPolicyResponse.  # noqa: E501
        :type category_types: List[CategoryType]
        :param deposit: The deposit of this SetPaymentPolicyResponse.  # noqa: E501
        :type deposit: Deposit
        :param description: The description of this SetPaymentPolicyResponse.  # noqa: E501
        :type description: str
        :param full_payment_due_in: The full_payment_due_in of this SetPaymentPolicyResponse.  # noqa: E501
        :type full_payment_due_in: TimeDuration
        :param immediate_pay: The immediate_pay of this SetPaymentPolicyResponse.  # noqa: E501
        :type immediate_pay: bool
        :param marketplace_id: The marketplace_id of this SetPaymentPolicyResponse.  # noqa: E501
        :type marketplace_id: str
        :param name: The name of this SetPaymentPolicyResponse.  # noqa: E501
        :type name: str
        :param payment_instructions: The payment_instructions of this SetPaymentPolicyResponse.  # noqa: E501
        :type payment_instructions: str
        :param payment_methods: The payment_methods of this SetPaymentPolicyResponse.  # noqa: E501
        :type payment_methods: List[PaymentMethod]
        :param payment_policy_id: The payment_policy_id of this SetPaymentPolicyResponse.  # noqa: E501
        :type payment_policy_id: str
        :param warnings: The warnings of this SetPaymentPolicyResponse.  # noqa: E501
        :type warnings: List[Error]
        """
        self.openapi_types = {
            'category_types': List[CategoryType],
            'deposit': Deposit,
            'description': str,
            'full_payment_due_in': TimeDuration,
            'immediate_pay': bool,
            'marketplace_id': str,
            'name': str,
            'payment_instructions': str,
            'payment_methods': List[PaymentMethod],
            'payment_policy_id': str,
            'warnings': List[Error]
        }

        self.attribute_map = {
            'category_types': 'categoryTypes',
            'deposit': 'deposit',
            'description': 'description',
            'full_payment_due_in': 'fullPaymentDueIn',
            'immediate_pay': 'immediatePay',
            'marketplace_id': 'marketplaceId',
            'name': 'name',
            'payment_instructions': 'paymentInstructions',
            'payment_methods': 'paymentMethods',
            'payment_policy_id': 'paymentPolicyId',
            'warnings': 'warnings'
        }

        self._category_types = category_types
        self._deposit = deposit
        self._description = description
        self._full_payment_due_in = full_payment_due_in
        self._immediate_pay = immediate_pay
        self._marketplace_id = marketplace_id
        self._name = name
        self._payment_instructions = payment_instructions
        self._payment_methods = payment_methods
        self._payment_policy_id = payment_policy_id
        self._warnings = warnings

    @classmethod
    def from_dict(cls, dikt) -> 'SetPaymentPolicyResponse':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The SetPaymentPolicyResponse of this SetPaymentPolicyResponse.  # noqa: E501
        :rtype: SetPaymentPolicyResponse
        """
        return util.deserialize_model(dikt, cls)

    @property
    def category_types(self) -> List[CategoryType]:
        """Gets the category_types of this SetPaymentPolicyResponse.

        This container indicates whether the payment business policy applies to motor vehicle listings, or if it applies to non-motor vehicle listings.  # noqa: E501

        :return: The category_types of this SetPaymentPolicyResponse.
        :rtype: List[CategoryType]
        """
        return self._category_types

    @category_types.setter
    def category_types(self, category_types: List[CategoryType]):
        """Sets the category_types of this SetPaymentPolicyResponse.

        This container indicates whether the payment business policy applies to motor vehicle listings, or if it applies to non-motor vehicle listings.  # noqa: E501

        :param category_types: The category_types of this SetPaymentPolicyResponse.
        :type category_types: List[CategoryType]
        """

        self._category_types = category_types

    @property
    def deposit(self) -> Deposit:
        """Gets the deposit of this SetPaymentPolicyResponse.


        :return: The deposit of this SetPaymentPolicyResponse.
        :rtype: Deposit
        """
        return self._deposit

    @deposit.setter
    def deposit(self, deposit: Deposit):
        """Sets the deposit of this SetPaymentPolicyResponse.


        :param deposit: The deposit of this SetPaymentPolicyResponse.
        :type deposit: Deposit
        """

        self._deposit = deposit

    @property
    def description(self) -> str:
        """Gets the description of this SetPaymentPolicyResponse.

        A seller-defined description of the payment business policy. This description is only for the seller's use, and is not exposed on any eBay pages. This field is returned if set for the policy. <br/><br/><b>Max length</b>: 250  # noqa: E501

        :return: The description of this SetPaymentPolicyResponse.
        :rtype: str
        """
        return self._description

    @description.setter
    def description(self, description: str):
        """Sets the description of this SetPaymentPolicyResponse.

        A seller-defined description of the payment business policy. This description is only for the seller's use, and is not exposed on any eBay pages. This field is returned if set for the policy. <br/><br/><b>Max length</b>: 250  # noqa: E501

        :param description: The description of this SetPaymentPolicyResponse.
        :type description: str
        """

        self._description = description

    @property
    def full_payment_due_in(self) -> TimeDuration:
        """Gets the full_payment_due_in of this SetPaymentPolicyResponse.


        :return: The full_payment_due_in of this SetPaymentPolicyResponse.
        :rtype: TimeDuration
        """
        return self._full_payment_due_in

    @full_payment_due_in.setter
    def full_payment_due_in(self, full_payment_due_in: TimeDuration):
        """Sets the full_payment_due_in of this SetPaymentPolicyResponse.


        :param full_payment_due_in: The full_payment_due_in of this SetPaymentPolicyResponse.
        :type full_payment_due_in: TimeDuration
        """

        self._full_payment_due_in = full_payment_due_in

    @property
    def immediate_pay(self) -> bool:
        """Gets the immediate_pay of this SetPaymentPolicyResponse.

        The value returned in this field will reflect the value set by the seller in the <b>immediatePay</b> request field. A value of <code>true</code> indicates that immediate payment is required from the buyer for: <ul><li>A fixed-price item</li><li>An auction item where the buyer is using the 'Buy it Now' option</li><li>A deposit for a motor vehicle listing</li></ul><br />It is possible for the seller to set this field as <code>true</code> in the payment business policy, but it will not apply in some scenarios. For example, immediate payment is not applicable for auction listings that have a winning bidder, for buyer purchases that involve the Best Offer feature, or for transactions that happen offline between the buyer and seller.  # noqa: E501

        :return: The immediate_pay of this SetPaymentPolicyResponse.
        :rtype: bool
        """
        return self._immediate_pay

    @immediate_pay.setter
    def immediate_pay(self, immediate_pay: bool):
        """Sets the immediate_pay of this SetPaymentPolicyResponse.

        The value returned in this field will reflect the value set by the seller in the <b>immediatePay</b> request field. A value of <code>true</code> indicates that immediate payment is required from the buyer for: <ul><li>A fixed-price item</li><li>An auction item where the buyer is using the 'Buy it Now' option</li><li>A deposit for a motor vehicle listing</li></ul><br />It is possible for the seller to set this field as <code>true</code> in the payment business policy, but it will not apply in some scenarios. For example, immediate payment is not applicable for auction listings that have a winning bidder, for buyer purchases that involve the Best Offer feature, or for transactions that happen offline between the buyer and seller.  # noqa: E501

        :param immediate_pay: The immediate_pay of this SetPaymentPolicyResponse.
        :type immediate_pay: bool
        """

        self._immediate_pay = immediate_pay

    @property
    def marketplace_id(self) -> str:
        """Gets the marketplace_id of this SetPaymentPolicyResponse.

        The ID of the eBay marketplace to which this payment business policy applies. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum'>eBay API documentation</a>  # noqa: E501

        :return: The marketplace_id of this SetPaymentPolicyResponse.
        :rtype: str
        """
        return self._marketplace_id

    @marketplace_id.setter
    def marketplace_id(self, marketplace_id: str):
        """Sets the marketplace_id of this SetPaymentPolicyResponse.

        The ID of the eBay marketplace to which this payment business policy applies. For implementation help, refer to <a href='https://developer.ebay.com/api-docs/sell/account/types/ba:MarketplaceIdEnum'>eBay API documentation</a>  # noqa: E501

        :param marketplace_id: The marketplace_id of this SetPaymentPolicyResponse.
        :type marketplace_id: str
        """

        self._marketplace_id = marketplace_id

    @property
    def name(self) -> str:
        """Gets the name of this SetPaymentPolicyResponse.

        A seller-defined name for this payment business policy. Names must be unique for policies assigned to the same marketplace.<br /><br /><b>Max length:</b> 64  # noqa: E501

        :return: The name of this SetPaymentPolicyResponse.
        :rtype: str
        """
        return self._name

    @name.setter
    def name(self, name: str):
        """Sets the name of this SetPaymentPolicyResponse.

        A seller-defined name for this payment business policy. Names must be unique for policies assigned to the same marketplace.<br /><br /><b>Max length:</b> 64  # noqa: E501

        :param name: The name of this SetPaymentPolicyResponse.
        :type name: str
        """

        self._name = name

    @property
    def payment_instructions(self) -> str:
        """Gets the payment_instructions of this SetPaymentPolicyResponse.

        <p class=\"tablenote\"><b>Note:</b> NO LONGER SUPPORTED. Although this field may be returned for some older payment business policies, payment instructions are no longer supported by payment business policies. If this field is returned, it can be ignored and these payment instructions will not appear in any listings that use the corresponding business policy.</p>A free-form string field that allows sellers to add detailed payment instructions to their listings.  # noqa: E501

        :return: The payment_instructions of this SetPaymentPolicyResponse.
        :rtype: str
        """
        return self._payment_instructions

    @payment_instructions.setter
    def payment_instructions(self, payment_instructions: str):
        """Sets the payment_instructions of this SetPaymentPolicyResponse.

        <p class=\"tablenote\"><b>Note:</b> NO LONGER SUPPORTED. Although this field may be returned for some older payment business policies, payment instructions are no longer supported by payment business policies. If this field is returned, it can be ignored and these payment instructions will not appear in any listings that use the corresponding business policy.</p>A free-form string field that allows sellers to add detailed payment instructions to their listings.  # noqa: E501

        :param payment_instructions: The payment_instructions of this SetPaymentPolicyResponse.
        :type payment_instructions: str
        """

        self._payment_instructions = payment_instructions

    @property
    def payment_methods(self) -> List[PaymentMethod]:
        """Gets the payment_methods of this SetPaymentPolicyResponse.

        This array shows the available payment methods that the seller has set for the payment business policy.<br /><br />Sellers do not have to specify any electronic payment methods for listings, so this array will often be returned empty unless the payment business policy is intended for motor vehicle listings or other items in categories where offline payments are required or supported.  # noqa: E501

        :return: The payment_methods of this SetPaymentPolicyResponse.
        :rtype: List[PaymentMethod]
        """
        return self._payment_methods

    @payment_methods.setter
    def payment_methods(self, payment_methods: List[PaymentMethod]):
        """Sets the payment_methods of this SetPaymentPolicyResponse.

        This array shows the available payment methods that the seller has set for the payment business policy.<br /><br />Sellers do not have to specify any electronic payment methods for listings, so this array will often be returned empty unless the payment business policy is intended for motor vehicle listings or other items in categories where offline payments are required or supported.  # noqa: E501

        :param payment_methods: The payment_methods of this SetPaymentPolicyResponse.
        :type payment_methods: List[PaymentMethod]
        """

        self._payment_methods = payment_methods

    @property
    def payment_policy_id(self) -> str:
        """Gets the payment_policy_id of this SetPaymentPolicyResponse.

        A unique eBay-assigned ID for a payment business policy. This ID is generated when the policy is created.  # noqa: E501

        :return: The payment_policy_id of this SetPaymentPolicyResponse.
        :rtype: str
        """
        return self._payment_policy_id

    @payment_policy_id.setter
    def payment_policy_id(self, payment_policy_id: str):
        """Sets the payment_policy_id of this SetPaymentPolicyResponse.

        A unique eBay-assigned ID for a payment business policy. This ID is generated when the policy is created.  # noqa: E501

        :param payment_policy_id: The payment_policy_id of this SetPaymentPolicyResponse.
        :type payment_policy_id: str
        """

        self._payment_policy_id = payment_policy_id

    @property
    def warnings(self) -> List[Error]:
        """Gets the warnings of this SetPaymentPolicyResponse.

        An array of one or more errors or warnings that were generated during the processing of the request. If there were no issues with the request, this array will return empty.  # noqa: E501

        :return: The warnings of this SetPaymentPolicyResponse.
        :rtype: List[Error]
        """
        return self._warnings

    @warnings.setter
    def warnings(self, warnings: List[Error]):
        """Sets the warnings of this SetPaymentPolicyResponse.

        An array of one or more errors or warnings that were generated during the processing of the request. If there were no issues with the request, this array will return empty.  # noqa: E501

        :param warnings: The warnings of this SetPaymentPolicyResponse.
        :type warnings: List[Error]
        """

        self._warnings = warnings