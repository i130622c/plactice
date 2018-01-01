import java.util.*;

public class Book implements Comparable<Book>, Cloneable {

	private String title;
	private Date publishDate;
	private String comment;

	/*
	 * remove()�Ȃǂ̃��\�b�h�ł̓I�u�W�F�N�g�̓������肪�s����B ���̍ۂɁA�u���������ē����ƌ��Ȃ����v��equals()���\�b�h�Œ�`����B
	 */
	@Override
	public boolean equals(Object o) {
		if (o == this)
			return true;
		if (o == null)
			return false;
		if (!(o instanceof Book)) {
			return false;
		}
		Book b = (Book) o;
		//�u�^�C�g���Ɣ��s���v�������ł���� true
		if (! title.equals(b.title)) {
			return false;
		} 
		if (! publishDate.equals(b.publishDate)) {
			return false;
		} 
		
		return true;
	}


	/*
	 * Hash�n�̃R���N�V����[HashSet�N���X, LinkedHashSet�N���X, HashMap�N���X]�ł�
	 * �n�b�V���l��p���ē���������s���B���������āAremone()���\�b�h�Ȃǂ��g�p����ꍇ�A
	 * equals()�̒�`�ɉ����AhashCode()�̒�`���K�v�ƂȂ�B
	 */
	@Override //
	public int hashCode() {
		int results = 37;
		results = results * 31 + title.hashCode();
		results = results * 31 + publishDate.hashCode();
		return results;
	}

	/*
	 * ������ɕ��ёւ���̂��Ƃ����u���R�����Â��v���`���Ă������Ƃ� sort()���\�b�h�𗘗p���ăI�u�W�F�N�g����ёւ��邱�Ƃ��ł���B
	 * 
	 * �y�I�u�W�F�N�g��C�ӂɕ��ёւ�����@�z �@Comparable�C���^�[�t�F�[�X�̎��� + compareTo()���\�b�h�̎���
	 * comareTo() -�߂�l���}�C�i�X�F this < ���� -�߂�l���O�F this = ���� -�߂�l���v���X�F this > ����
	 * 
	 * �AComparator�C���^�t�F�[�X�����������V�N���X���쐬 + compare()���\�b�h�̎��� compare() -�߂�l���}�C�i�X�F
	 * ����1 < ����2 -�߂�l��0�F ����1 = ����2 -�߂�l���v���X�F ����1 > ����2
	 */
	@Override
	public int compareTo(Book b) {
		return this.publishDate.compareTo(b.publishDate);
	}

	/*
	 * �����C���X�^���X�𐶂ݏo�������ꍇ�A ������Z�q��p������@�́A�u�Q�Ɛ悪�R�s�[�v����邾���ł��邽�߃_���I
	 * clone()���\�b�h��p���邱�ƂŁA�u�C���X�^���X���̂𕡐��v�ł���B
	 * 
	 * �����Aclone()���\�b�h�́A��{�I�Ƀv���~�e�B�u�^�iint�^, String�^...�j�̕ϐ������������Ȃ��i�V�����[�E�R�s�[�j
	 * �t�B�[���h�ɃN���X�^�̕ϐ����܂܂��ꍇ�́A�������f�B�[�v�E�R�s�[���鏈�����A�ʓr�L�q����K�v������B
	 * 
	 * �y���\�b�h�̕������@�z Cloneable�C���^�[�t�F�[�X�̎��� + clone()���\�b�h�̎���
	 */
	@Override
	public Book clone() {
		try {
			// �V�����[�E�R�s�[ *super.clope()���g�p����I
			// ���ϖ߂�l�^�F ���\�b�h���I�[�o�[���C�h����ہA���̖߂�l�������肳�ꂽ�^�ɒu�������邱�Ƃ��ł���
			// Object -> Book
			Book b = (Book) super.clone();
			// �f�B�[�v�E�R�s�[
			b.publishDate = (Date) publishDate.clone();
			return b;
		} catch (CloneNotSupportedException e) {
			throw new InternalError(e.toString());
		}
	}
	
	public String toString(){
		return title + " / " + comment + " / " + publishDate;
	}

	// �Q�b�^�[�ƃZ�b�^�[
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Date getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}
