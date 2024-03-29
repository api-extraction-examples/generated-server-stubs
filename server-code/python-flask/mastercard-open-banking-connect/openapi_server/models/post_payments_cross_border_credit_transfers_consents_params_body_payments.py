from datetime import date, datetime  # noqa: F401

from typing import List, Dict  # noqa: F401

from openapi_server.models.base_model import Model
from openapi_server.models.post_payments_cross_border_credit_transfers_consents_params_body_payments_creditor_account import PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAccount
from openapi_server.models.post_payments_cross_border_credit_transfers_consents_params_body_payments_creditor_address import PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAddress
from openapi_server.models.post_payments_cross_border_credit_transfers_consents_params_body_payments_creditor_agent import PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAgent
from openapi_server.models.post_payments_cross_border_credit_transfers_consents_params_body_payments_debtor_account import PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAccount
from openapi_server.models.post_payments_cross_border_credit_transfers_consents_params_body_payments_debtor_address import PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAddress
from openapi_server.models.post_payments_cross_border_credit_transfers_consents_params_body_payments_instructed_amount import PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsInstructedAmount
from openapi_server import util

from openapi_server.models.post_payments_cross_border_credit_transfers_consents_params_body_payments_creditor_account import PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAccount  # noqa: E501
from openapi_server.models.post_payments_cross_border_credit_transfers_consents_params_body_payments_creditor_address import PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAddress  # noqa: E501
from openapi_server.models.post_payments_cross_border_credit_transfers_consents_params_body_payments_creditor_agent import PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAgent  # noqa: E501
from openapi_server.models.post_payments_cross_border_credit_transfers_consents_params_body_payments_debtor_account import PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAccount  # noqa: E501
from openapi_server.models.post_payments_cross_border_credit_transfers_consents_params_body_payments_debtor_address import PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAddress  # noqa: E501
from openapi_server.models.post_payments_cross_border_credit_transfers_consents_params_body_payments_instructed_amount import PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsInstructedAmount  # noqa: E501

class PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments(Model):
    """NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).

    Do not edit the class manually.
    """

    def __init__(self, creditor_account=None, creditor_address=None, creditor_agent=None, creditor_name=None, debtor_account=None, debtor_address=None, debtor_name=None, end_to_end_identification=None, instructed_amount=None, instruction_identification=None, instruction_priority=None, local_instrument=None, remittance_information_reference=None, remittance_information_unstructured=None, requested_execution_date=None, transfer_charges=None):  # noqa: E501
        """PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments - a model defined in OpenAPI

        :param creditor_account: The creditor_account of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.  # noqa: E501
        :type creditor_account: PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAccount
        :param creditor_address: The creditor_address of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.  # noqa: E501
        :type creditor_address: PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAddress
        :param creditor_agent: The creditor_agent of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.  # noqa: E501
        :type creditor_agent: PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAgent
        :param creditor_name: The creditor_name of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.  # noqa: E501
        :type creditor_name: str
        :param debtor_account: The debtor_account of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.  # noqa: E501
        :type debtor_account: PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAccount
        :param debtor_address: The debtor_address of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.  # noqa: E501
        :type debtor_address: PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAddress
        :param debtor_name: The debtor_name of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.  # noqa: E501
        :type debtor_name: str
        :param end_to_end_identification: The end_to_end_identification of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.  # noqa: E501
        :type end_to_end_identification: str
        :param instructed_amount: The instructed_amount of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.  # noqa: E501
        :type instructed_amount: PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsInstructedAmount
        :param instruction_identification: The instruction_identification of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.  # noqa: E501
        :type instruction_identification: str
        :param instruction_priority: The instruction_priority of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.  # noqa: E501
        :type instruction_priority: str
        :param local_instrument: The local_instrument of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.  # noqa: E501
        :type local_instrument: str
        :param remittance_information_reference: The remittance_information_reference of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.  # noqa: E501
        :type remittance_information_reference: str
        :param remittance_information_unstructured: The remittance_information_unstructured of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.  # noqa: E501
        :type remittance_information_unstructured: str
        :param requested_execution_date: The requested_execution_date of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.  # noqa: E501
        :type requested_execution_date: date
        :param transfer_charges: The transfer_charges of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.  # noqa: E501
        :type transfer_charges: str
        """
        self.openapi_types = {
            'creditor_account': PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAccount,
            'creditor_address': PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAddress,
            'creditor_agent': PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAgent,
            'creditor_name': str,
            'debtor_account': PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAccount,
            'debtor_address': PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAddress,
            'debtor_name': str,
            'end_to_end_identification': str,
            'instructed_amount': PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsInstructedAmount,
            'instruction_identification': str,
            'instruction_priority': str,
            'local_instrument': str,
            'remittance_information_reference': str,
            'remittance_information_unstructured': str,
            'requested_execution_date': date,
            'transfer_charges': str
        }

        self.attribute_map = {
            'creditor_account': 'creditorAccount',
            'creditor_address': 'creditorAddress',
            'creditor_agent': 'creditorAgent',
            'creditor_name': 'creditorName',
            'debtor_account': 'debtorAccount',
            'debtor_address': 'debtorAddress',
            'debtor_name': 'debtorName',
            'end_to_end_identification': 'endToEndIdentification',
            'instructed_amount': 'instructedAmount',
            'instruction_identification': 'instructionIdentification',
            'instruction_priority': 'instructionPriority',
            'local_instrument': 'localInstrument',
            'remittance_information_reference': 'remittanceInformationReference',
            'remittance_information_unstructured': 'remittanceInformationUnstructured',
            'requested_execution_date': 'requestedExecutionDate',
            'transfer_charges': 'transferCharges'
        }

        self._creditor_account = creditor_account
        self._creditor_address = creditor_address
        self._creditor_agent = creditor_agent
        self._creditor_name = creditor_name
        self._debtor_account = debtor_account
        self._debtor_address = debtor_address
        self._debtor_name = debtor_name
        self._end_to_end_identification = end_to_end_identification
        self._instructed_amount = instructed_amount
        self._instruction_identification = instruction_identification
        self._instruction_priority = instruction_priority
        self._local_instrument = local_instrument
        self._remittance_information_reference = remittance_information_reference
        self._remittance_information_unstructured = remittance_information_unstructured
        self._requested_execution_date = requested_execution_date
        self._transfer_charges = transfer_charges

    @classmethod
    def from_dict(cls, dikt) -> 'PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments':
        """Returns the dict as a model

        :param dikt: A dict.
        :type: dict
        :return: The postPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.  # noqa: E501
        :rtype: PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments
        """
        return util.deserialize_model(dikt, cls)

    @property
    def creditor_account(self) -> PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAccount:
        """Gets the creditor_account of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.


        :return: The creditor_account of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.
        :rtype: PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAccount
        """
        return self._creditor_account

    @creditor_account.setter
    def creditor_account(self, creditor_account: PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAccount):
        """Sets the creditor_account of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.


        :param creditor_account: The creditor_account of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.
        :type creditor_account: PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAccount
        """
        if creditor_account is None:
            raise ValueError("Invalid value for `creditor_account`, must not be `None`")  # noqa: E501

        self._creditor_account = creditor_account

    @property
    def creditor_address(self) -> PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAddress:
        """Gets the creditor_address of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.


        :return: The creditor_address of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.
        :rtype: PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAddress
        """
        return self._creditor_address

    @creditor_address.setter
    def creditor_address(self, creditor_address: PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAddress):
        """Sets the creditor_address of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.


        :param creditor_address: The creditor_address of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.
        :type creditor_address: PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAddress
        """

        self._creditor_address = creditor_address

    @property
    def creditor_agent(self) -> PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAgent:
        """Gets the creditor_agent of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.


        :return: The creditor_agent of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.
        :rtype: PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAgent
        """
        return self._creditor_agent

    @creditor_agent.setter
    def creditor_agent(self, creditor_agent: PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAgent):
        """Sets the creditor_agent of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.


        :param creditor_agent: The creditor_agent of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.
        :type creditor_agent: PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsCreditorAgent
        """
        if creditor_agent is None:
            raise ValueError("Invalid value for `creditor_agent`, must not be `None`")  # noqa: E501

        self._creditor_agent = creditor_agent

    @property
    def creditor_name(self) -> str:
        """Gets the creditor_name of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.

        Bank name  # noqa: E501

        :return: The creditor_name of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.
        :rtype: str
        """
        return self._creditor_name

    @creditor_name.setter
    def creditor_name(self, creditor_name: str):
        """Sets the creditor_name of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.

        Bank name  # noqa: E501

        :param creditor_name: The creditor_name of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.
        :type creditor_name: str
        """
        if creditor_name is None:
            raise ValueError("Invalid value for `creditor_name`, must not be `None`")  # noqa: E501
        if creditor_name is not None and len(creditor_name) > 256:
            raise ValueError("Invalid value for `creditor_name`, length must be less than or equal to `256`")  # noqa: E501
        if creditor_name is not None and len(creditor_name) < 1:
            raise ValueError("Invalid value for `creditor_name`, length must be greater than or equal to `1`")  # noqa: E501

        self._creditor_name = creditor_name

    @property
    def debtor_account(self) -> PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAccount:
        """Gets the debtor_account of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.


        :return: The debtor_account of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.
        :rtype: PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAccount
        """
        return self._debtor_account

    @debtor_account.setter
    def debtor_account(self, debtor_account: PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAccount):
        """Sets the debtor_account of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.


        :param debtor_account: The debtor_account of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.
        :type debtor_account: PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAccount
        """
        if debtor_account is None:
            raise ValueError("Invalid value for `debtor_account`, must not be `None`")  # noqa: E501

        self._debtor_account = debtor_account

    @property
    def debtor_address(self) -> PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAddress:
        """Gets the debtor_address of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.


        :return: The debtor_address of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.
        :rtype: PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAddress
        """
        return self._debtor_address

    @debtor_address.setter
    def debtor_address(self, debtor_address: PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAddress):
        """Sets the debtor_address of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.


        :param debtor_address: The debtor_address of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.
        :type debtor_address: PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsDebtorAddress
        """

        self._debtor_address = debtor_address

    @property
    def debtor_name(self) -> str:
        """Gets the debtor_name of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.

        Debtor legal name  # noqa: E501

        :return: The debtor_name of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.
        :rtype: str
        """
        return self._debtor_name

    @debtor_name.setter
    def debtor_name(self, debtor_name: str):
        """Sets the debtor_name of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.

        Debtor legal name  # noqa: E501

        :param debtor_name: The debtor_name of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.
        :type debtor_name: str
        """
        if debtor_name is not None and len(debtor_name) > 256:
            raise ValueError("Invalid value for `debtor_name`, length must be less than or equal to `256`")  # noqa: E501
        if debtor_name is not None and len(debtor_name) < 1:
            raise ValueError("Invalid value for `debtor_name`, length must be greater than or equal to `1`")  # noqa: E501

        self._debtor_name = debtor_name

    @property
    def end_to_end_identification(self) -> str:
        """Gets the end_to_end_identification of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.

        Payment end to end identification  # noqa: E501

        :return: The end_to_end_identification of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.
        :rtype: str
        """
        return self._end_to_end_identification

    @end_to_end_identification.setter
    def end_to_end_identification(self, end_to_end_identification: str):
        """Sets the end_to_end_identification of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.

        Payment end to end identification  # noqa: E501

        :param end_to_end_identification: The end_to_end_identification of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.
        :type end_to_end_identification: str
        """
        if end_to_end_identification is None:
            raise ValueError("Invalid value for `end_to_end_identification`, must not be `None`")  # noqa: E501
        if end_to_end_identification is not None and len(end_to_end_identification) > 18:
            raise ValueError("Invalid value for `end_to_end_identification`, length must be less than or equal to `18`")  # noqa: E501
        if end_to_end_identification is not None and len(end_to_end_identification) < 1:
            raise ValueError("Invalid value for `end_to_end_identification`, length must be greater than or equal to `1`")  # noqa: E501

        self._end_to_end_identification = end_to_end_identification

    @property
    def instructed_amount(self) -> PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsInstructedAmount:
        """Gets the instructed_amount of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.


        :return: The instructed_amount of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.
        :rtype: PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsInstructedAmount
        """
        return self._instructed_amount

    @instructed_amount.setter
    def instructed_amount(self, instructed_amount: PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsInstructedAmount):
        """Sets the instructed_amount of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.


        :param instructed_amount: The instructed_amount of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.
        :type instructed_amount: PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPaymentsInstructedAmount
        """
        if instructed_amount is None:
            raise ValueError("Invalid value for `instructed_amount`, must not be `None`")  # noqa: E501

        self._instructed_amount = instructed_amount

    @property
    def instruction_identification(self) -> str:
        """Gets the instruction_identification of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.

        Unique identification as assigned by an instructing party for an instructed party to unambiguously identify the instruction. If API profile of ASPSP is CMA9, then field is mandatory.  # noqa: E501

        :return: The instruction_identification of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.
        :rtype: str
        """
        return self._instruction_identification

    @instruction_identification.setter
    def instruction_identification(self, instruction_identification: str):
        """Sets the instruction_identification of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.

        Unique identification as assigned by an instructing party for an instructed party to unambiguously identify the instruction. If API profile of ASPSP is CMA9, then field is mandatory.  # noqa: E501

        :param instruction_identification: The instruction_identification of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.
        :type instruction_identification: str
        """
        if instruction_identification is not None and len(instruction_identification) > 256:
            raise ValueError("Invalid value for `instruction_identification`, length must be less than or equal to `256`")  # noqa: E501
        if instruction_identification is not None and len(instruction_identification) < 1:
            raise ValueError("Invalid value for `instruction_identification`, length must be greater than or equal to `1`")  # noqa: E501

        self._instruction_identification = instruction_identification

    @property
    def instruction_priority(self) -> str:
        """Gets the instruction_priority of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.

        Indicator of the urgency or order of importance  # noqa: E501

        :return: The instruction_priority of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.
        :rtype: str
        """
        return self._instruction_priority

    @instruction_priority.setter
    def instruction_priority(self, instruction_priority: str):
        """Sets the instruction_priority of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.

        Indicator of the urgency or order of importance  # noqa: E501

        :param instruction_priority: The instruction_priority of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.
        :type instruction_priority: str
        """
        allowed_values = ["Normal", "Urgent"]  # noqa: E501
        if instruction_priority not in allowed_values:
            raise ValueError(
                "Invalid value for `instruction_priority` ({0}), must be one of {1}"
                .format(instruction_priority, allowed_values)
            )

        self._instruction_priority = instruction_priority

    @property
    def local_instrument(self) -> str:
        """Gets the local_instrument of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.

        User community specific instrument.  # noqa: E501

        :return: The local_instrument of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.
        :rtype: str
        """
        return self._local_instrument

    @local_instrument.setter
    def local_instrument(self, local_instrument: str):
        """Sets the local_instrument of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.

        User community specific instrument.  # noqa: E501

        :param local_instrument: The local_instrument of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.
        :type local_instrument: str
        """
        allowed_values = ["Swift"]  # noqa: E501
        if local_instrument not in allowed_values:
            raise ValueError(
                "Invalid value for `local_instrument` ({0}), must be one of {1}"
                .format(local_instrument, allowed_values)
            )

        self._local_instrument = local_instrument

    @property
    def remittance_information_reference(self) -> str:
        """Gets the remittance_information_reference of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.

        Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. (future use)  # noqa: E501

        :return: The remittance_information_reference of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.
        :rtype: str
        """
        return self._remittance_information_reference

    @remittance_information_reference.setter
    def remittance_information_reference(self, remittance_information_reference: str):
        """Sets the remittance_information_reference of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.

        Unique reference, as assigned by the creditor, to unambiguously refer to the payment transaction. (future use)  # noqa: E501

        :param remittance_information_reference: The remittance_information_reference of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.
        :type remittance_information_reference: str
        """
        if remittance_information_reference is not None and len(remittance_information_reference) > 256:
            raise ValueError("Invalid value for `remittance_information_reference`, length must be less than or equal to `256`")  # noqa: E501
        if remittance_information_reference is not None and len(remittance_information_reference) < 1:
            raise ValueError("Invalid value for `remittance_information_reference`, length must be greater than or equal to `1`")  # noqa: E501

        self._remittance_information_reference = remittance_information_reference

    @property
    def remittance_information_unstructured(self) -> str:
        """Gets the remittance_information_unstructured of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.

        Description of the payment  # noqa: E501

        :return: The remittance_information_unstructured of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.
        :rtype: str
        """
        return self._remittance_information_unstructured

    @remittance_information_unstructured.setter
    def remittance_information_unstructured(self, remittance_information_unstructured: str):
        """Sets the remittance_information_unstructured of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.

        Description of the payment  # noqa: E501

        :param remittance_information_unstructured: The remittance_information_unstructured of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.
        :type remittance_information_unstructured: str
        """
        if remittance_information_unstructured is not None and len(remittance_information_unstructured) > 256:
            raise ValueError("Invalid value for `remittance_information_unstructured`, length must be less than or equal to `256`")  # noqa: E501
        if remittance_information_unstructured is not None and len(remittance_information_unstructured) < 1:
            raise ValueError("Invalid value for `remittance_information_unstructured`, length must be greater than or equal to `1`")  # noqa: E501

        self._remittance_information_unstructured = remittance_information_unstructured

    @property
    def requested_execution_date(self) -> date:
        """Gets the requested_execution_date of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.

        Scheduled Payment Date  # noqa: E501

        :return: The requested_execution_date of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.
        :rtype: date
        """
        return self._requested_execution_date

    @requested_execution_date.setter
    def requested_execution_date(self, requested_execution_date: date):
        """Sets the requested_execution_date of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.

        Scheduled Payment Date  # noqa: E501

        :param requested_execution_date: The requested_execution_date of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.
        :type requested_execution_date: date
        """

        self._requested_execution_date = requested_execution_date

    @property
    def transfer_charges(self) -> str:
        """Gets the transfer_charges of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.

        Charge bearer  # noqa: E501

        :return: The transfer_charges of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.
        :rtype: str
        """
        return self._transfer_charges

    @transfer_charges.setter
    def transfer_charges(self, transfer_charges: str):
        """Sets the transfer_charges of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.

        Charge bearer  # noqa: E501

        :param transfer_charges: The transfer_charges of this PostPaymentsCrossBorderCreditTransfersConsentsParamsBodyPayments.
        :type transfer_charges: str
        """
        allowed_values = ["SEN", "SHA", "BEN"]  # noqa: E501
        if transfer_charges not in allowed_values:
            raise ValueError(
                "Invalid value for `transfer_charges` ({0}), must be one of {1}"
                .format(transfer_charges, allowed_values)
            )

        self._transfer_charges = transfer_charges
